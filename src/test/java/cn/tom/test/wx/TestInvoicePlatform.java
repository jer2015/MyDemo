package cn.tom.test.wx;

import cn.tom.test.wx.http.HttpUtils;
import cn.tom.test.wx.model.*;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lxl
 */
public class TestInvoicePlatform {
    final static String GET = "GET";
    final static String POST = "POST";

    String appId = "wxf35f0806957a6801";
    String appSecret = "b4ac76a051685121aa5ee3c7b7212a4d";

    String accessToken = "6dKzm5-vpwQohaOlI-i3Ik8QU0sLTVeVma8RX6dsZ9569k_bxofCoaqBDJxelLEcRDMma4QP6nOi6tORucBzvIdY2KmQYhjwBvm1eLtuB9d74PmKcfS6gVXE8Q12CdYYMFWiAHAWPG";


    /**
     * 创建发票接口
     * 发票平台可以通过这个接口可以帮助商户创建一张发票模板
     * url: https://api.weixin.qq.com/card/create?access_token={access_token}
     * method:post
     * 数据格式:json
     * <p>
     * 返回：
     * errcode:0
     * errmsg:ok
     * card_id:p0gGxwUgVzg_1TiKB9bmuz18-kb4
     */
    @Test
    public void createInvoiceTest() {
        String requestUrl = "https://api.weixin.qq.com/card/create?access_token=ACCESS_TOKEN";
        requestUrl = requestUrl.replaceAll("ACCESS_TOKEN", accessToken);

        Sku sku = new Sku();
        sku.setQuantity(2000);

        DateInfo dateInfo = new DateInfo();
        dateInfo.setType("DATE_TYPE_FIX_TIME_RANGE");
        long begin = new Date().getTime();
        dateInfo.setBegin_timestamp(begin / 1000);
        dateInfo.setEnd_timestamp(begin + 10 * 24 * 60 * 60);

        BaseInfo baseInfo = new BaseInfo();
        baseInfo.setSku(sku);
        baseInfo.setLogo_url("http://mmbiz.qpic.cn/mmbiz/iaL1LJM1mF9aRKPZJkmG8xXhiaHqkKSVMMWeN3hLut7X7hicFNjakm xibMLGWpXrEXB33367o7zHN0CwngnQY7zb7g/0");
        baseInfo.setBrand_name("增值税电子普通发票");
        baseInfo.setTitle("商户名称世纪信息有");
        baseInfo.setColor("Color100");
        baseInfo.setCode_type("CODE_TYPE_NONE");
        baseInfo.setDescription("发票使用说明");
        baseInfo.setCan_give_friend(false);
        baseInfo.setDate_info(dateInfo);
        baseInfo.setCan_share(false);

        Invoice invoice = new Invoice();
        invoice.setDetail("发票详情，建议填入发票使用说明");
        invoice.setPayee("收款方-名称");
        invoice.setBase_info(baseInfo);

        InvoiceCard invoiceCard = new InvoiceCard();
        invoiceCard.setCard_type("INVOICE");
        invoiceCard.setInvoice(invoice);

        CreateInvoice createInvoice = new CreateInvoice();
        createInvoice.setCard(invoiceCard);

        String jsonData = JSONObject.toJSONString(createInvoice);
        System.out.println(jsonData);
        JSONObject jsonObject = HttpUtils.httpsRequest(requestUrl, POST, jsonData);
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    /**
     * 将发票插入用户卡包 POST
     * <p>
     * errcode:72031
     * errmsg:invalid params hint: [W1vZwa0369e415]
     * <p>
     * errcode:72038
     * errmsg:invoice order never auth hint: [.WL5qA0927e572]
     */
    @Test
    public void insertCardTest() {
        String requestUrl = " https://api.weixin.qq.com/card/invoice/insert?access_token=ACCESS_TOKEN";
        requestUrl = requestUrl.replaceAll("ACCESS_TOKEN", accessToken);

        ArrayList<InvoiceInfo> invoiceInfos = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            InvoiceInfo invoiceInfo = new InvoiceInfo();
            invoiceInfo.setName("项目名-水杯" + (i + 1));
            invoiceInfo.setNum("2");
            invoiceInfo.setPrice("10.5");
            invoiceInfo.setUnit("个");
            invoiceInfos.add(invoiceInfo);
        }

        InvoiceUserData invoiceUserData = new InvoiceUserData();
        invoiceUserData.setFee("21.00");
        invoiceUserData.setTitle("发票抬头个人");
        invoiceUserData.setBilling_time(String.valueOf(new Date().getTime()));
        invoiceUserData.setBilling_no("123456789012");
        invoiceUserData.setBilling_code("12345678");
        invoiceUserData.setInfo(invoiceInfos);
        invoiceUserData.setFee_without_tax("18.25");
        invoiceUserData.setTax("2.75");
        invoiceUserData.setDetail("发票详情");
        invoiceUserData.setPdf_url("pdf_url");
        invoiceUserData.setReimburse_status("INVOICE_REIMBURSE_INIT");

        UserCard userCard = new UserCard();
        userCard.setInvoice_user_data(invoiceUserData);

        CardExt cardExt = new CardExt();
        cardExt.setOuter_str("outer_str");
        cardExt.setCode("123456");
        cardExt.setNonce_str("j!Re1WxRty");
        cardExt.setUser_card(userCard);

        InsertCard insertCard = new InsertCard();
        insertCard.setOrder_id("11116");
        insertCard.setCard_id("p0gGxwUgVzg_1TiKB9bmuz18-kb4");
        insertCard.setAppid("wxf35f0806957a6801");
        insertCard.setCard_ext(cardExt);

        String jsonData = JSONObject.toJSONString(insertCard);
        System.out.println("jsonData:\n" + jsonData);
        JSONObject jsonObject = HttpUtils.httpsRequest(requestUrl, POST, jsonData);
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    /**
     * 获取发票平台授权链接接口 GET
     * <p>
     * errcode:0
     * errmsg:ok
     * invoice_url:https://mp.weixin.qq.com/bizmall/authinvoice?action=list&s_pappid=d3hmMzVmMDgwNjk1N2E2ODAxX7tYStgrzRjZIV4_F5bFNcgFGhKsE_qD_X9rwmokY3CV
     * s_pappid : d3hmMzVmMDgwNjk1N2E2ODAxX7tYStgrzRjZIV4_F5bFNcgFGhKsE_qD_X9rwmokY3CV
     */
    @Test
    public void getAuthLinkTest() {
        String requestUrl = "https://api.weixin.qq.com/card/invoice/seturl?access_token=ACCESS_TOKEN";
        requestUrl = requestUrl.replaceAll("ACCESS_TOKEN", accessToken);
        JSONObject jsonObject = HttpUtils.httpsRequest(requestUrl, GET, "{}");
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("\n该发票专用的授权链接:");
        System.out.println(jsonObject.get("invoice_url"));
    }

    /**
     * 获取accessToken接口 GET
     */
    @Test
    public void getAccessTokenTest() {
        // 拼接请求地址
        String requestUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
        requestUrl = requestUrl.replaceAll("APPID", appId).replaceAll("APPSECRET", appSecret);
        // 需要提交的json数据
        Map<String, Object> map = new HashMap<>();
        String jsonData = JSONObject.toJSONString(map);
        //发送请求获取结果
        JSONObject jsonObject = HttpUtils.httpsRequest(requestUrl, GET, jsonData);
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
