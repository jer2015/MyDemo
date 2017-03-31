package cn.tom.test.wx;

import cn.tom.test.wx.http.HttpUtils;
import cn.tom.test.wx.model.AuthField;
import cn.tom.test.wx.model.AuthPageLink;
import cn.tom.test.wx.model.BizField;
import cn.tom.test.wx.model.UserField;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lxl
 */
public class TestMerchant {
    final static String GET = "GET";
    final static String POST = "POST";

    String appId = "wx27f717246ae3b45e";
    String appSecret = "f91b1e8f8808e5a57e43c4aabd721be5";

    String accessToken = "m7zz9o2nzCIfPeMjZ4A4fGsstEahQ6T3vosAHo7PO4kRSJCFSDDH8VGY4jkDTqehMSOg7E3XjbvITRRhSNHrCLSU_MtLxQweAkUnrBbcf5Ied-rbw3EOzjSms6w5hRT3LVTcAAAAKI";


    /**
     * 4.1 设置授权页字段信息接口
     * url: https://api.weixin.qq.com/card/invoice/setbizattr?action=set_auth_field&access_token={access_token}
     * 请求方法:POST
     * 数据格式:JSON
     */
    @Test
    public void setAuthFieldTest() {
        String requestUrl = "https://api.weixin.qq.com/card/invoice/setbizattr?action=set_auth_field&access_token=ACCESS_TOKEN";
        requestUrl = requestUrl.replaceAll("ACCESS_TOKEN", accessToken);
        HashMap<String, Object> map = new HashMap<>();
        AuthField authField = new AuthField();

        UserField userField = new UserField();
        userField.setShow_title(1);
        userField.setShow_phone(1);
        userField.setShow_email(1);

        BizField bizField = new BizField();
        bizField.setShow_title(1);
        bizField.setShow_tax_no(0);
        bizField.setShow_addr(0);
        bizField.setShow_phone(1);
        bizField.setShow_bank_type(0);
        bizField.setShow_bank_no(0);

        authField.setUser_field(userField);
        map.put("auth_field", authField);
        map.put("biz_field", bizField);
        String jsonData = JSONObject.toJSONString(map);

        System.out.println(jsonData);
        JSONObject jsonObject = HttpUtils.httpsRequest(requestUrl, POST, jsonData);
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    /**
     * 4.2 查询授权页字段信息接口
     * url: https://api.weixin.qq.com/card/invoice/setbizattr?action=get_auth_field&access_token={access_token}
     * 请求方法:POST
     * 请求参数
     * 数据格式:JSON
     * 数据为空，传{}
     */
    @Test
    public void getAuthFieldTest() {
        String requestUrl = "https://api.weixin.qq.com/card/invoice/setbizattr?action=get_auth_field&access_token=ACCESS_TOKEN";
        requestUrl = requestUrl.replaceAll("ACCESS_TOKEN", accessToken);
        //发送请求获取结果
        JSONObject jsonObject = HttpUtils.httpsRequest(requestUrl, GET, "{}");
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    /**
     * 6.4 获取授权页链接接口
     * url: https://api.weixin.qq.com/card/invoice/getauthurl?access_token={access_token}
     * 请求方法:POST
     *
     * errcode:48001
     * errmsg:api unauthorized hint: [1yeo8a0200tat4]
     */
    @Test
    public void getAuthPageTest() {
        String requestUrl = "https://api.weixin.qq.com/card/invoice/getauthurl?access_token=ACCESS_TOKEN";
        requestUrl = requestUrl.replaceAll("ACCESS_TOKEN", accessToken);

        AuthPageLink authPageLink = new AuthPageLink();
        authPageLink.setS_pappid("d3hmMzVmMDgwNjk1N2E2ODAxX7tYStgrzRjZIV4_F5bFNcgFGhKsE_qD_X9rwmokY3CV");
        authPageLink.setOrder_id("123456");
        authPageLink.setMoney(100);
        authPageLink.setTimestamp((int) (new Date().getTime()/1000));
        authPageLink.setSource("web");
        authPageLink.setRedirect_url("https://mp.weixin.qq.com");
        authPageLink.setTicket("IpK_1T69hDhZkLQTlwsAX_3YI6n82i10sRO0rNJGn45z7E7zA-iChiijz0c7r_xLxb0RRSHL4c916LZGcWJ5fg");
        authPageLink.setType(2);

        String jsonData = JSONObject.toJSONString(authPageLink);
        System.out.println(jsonData);
        JSONObject jsonObject = HttpUtils.httpsRequest(requestUrl, POST, jsonData);
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    /**
     * 6.3 获取发票 ticket
     * ttp 请求方式 GET
     * URL: https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=wx_card
     * POST 数据格式 JSON
     *
     * errcode:0
     * ticket:IpK_1T69hDhZkLQTlwsAX_3YI6n82i10sRO0rNJGn45z7E7zA-iChiijz0c7r_xLxb0RRSHL4c916LZGcWJ5fg
     * errmsg:ok
     * expires_in:7200
     */
    @Test
    public void getTicketTest() {
        String requestUrl = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=wx_card";
        requestUrl = requestUrl.replaceAll("ACCESS_TOKEN", accessToken);
        Map<String, Object> map = new HashMap<>();
        String jsonData = JSONObject.toJSONString(map);
        JSONObject jsonObject = HttpUtils.httpsRequest(requestUrl, GET, jsonData);
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
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
