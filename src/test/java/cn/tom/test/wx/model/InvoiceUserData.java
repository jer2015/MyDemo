package cn.tom.test.wx.model;

import java.util.List;

/**
 * @author lxl
 */
public class InvoiceUserData {
    /**
     * 发票的金额，以分为单位
     */
    private String fee;

    /**
     * 发票的抬头
     */
    private String title;

    /**
     * 发票的开票时间，为 10 位时间戳(utc+8)
     */
    private String billing_time;

    /**
     * 发票的发票代码
     */
    private String billing_no;

    /**
     * 发票的发票号码
     */
    private String billing_code;

    /**
     * 商品详情结构 非必填
     */
    private List<InvoiceInfo> info;

    /**
     * 不含税金额，以分为单位
     */
    private String fee_without_tax;

    /**
     * 税额，以分为单位
     */
    private String tax;

    /**
     * 发票的详情
     */
    private String detail;

    /**
     * 发票 pdf 的 url
     * 当报销方请求时，微信会在该 url 上附带报销方的身份 token
     * 开票平台可以 针对微信的 token 进行校验，保证该次请求的 合法性
     */
    private String pdf_url;

    /**
     * 发票报销状态
     * INVOICE_REIMBURSE_INIT     发票初始状态，未锁定
     * INVOICE_REIMBURSE_LOCK     发票已锁定
     * INVOICE_REIMBURSE_CLOSURE  发票已核销
     */
    private String reimburse_status;

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBilling_time() {
        return billing_time;
    }

    public void setBilling_time(String billing_time) {
        this.billing_time = billing_time;
    }

    public String getBilling_no() {
        return billing_no;
    }

    public void setBilling_no(String billing_no) {
        this.billing_no = billing_no;
    }

    public String getBilling_code() {
        return billing_code;
    }

    public void setBilling_code(String billing_code) {
        this.billing_code = billing_code;
    }

    public List<InvoiceInfo> getInfo() {
        return info;
    }

    public void setInfo(List<InvoiceInfo> info) {
        this.info = info;
    }

    public String getFee_without_tax() {
        return fee_without_tax;
    }

    public void setFee_without_tax(String fee_without_tax) {
        this.fee_without_tax = fee_without_tax;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPdf_url() {
        return pdf_url;
    }

    public void setPdf_url(String pdf_url) {
        this.pdf_url = pdf_url;
    }

    public String getReimburse_status() {
        return reimburse_status;
    }

    public void setReimburse_status(String reimburse_status) {
        this.reimburse_status = reimburse_status;
    }

    @Override
    public String toString() {
        return "InvoiceUserData{" +
                "fee='" + fee + '\'' +
                ", title='" + title + '\'' +
                ", billing_time='" + billing_time + '\'' +
                ", billing_no='" + billing_no + '\'' +
                ", billing_code='" + billing_code + '\'' +
                ", info=" + info +
                ", fee_without_tax='" + fee_without_tax + '\'' +
                ", tax='" + tax + '\'' +
                ", detail='" + detail + '\'' +
                ", pdf_url='" + pdf_url + '\'' +
                ", reimburse_status='" + reimburse_status + '\'' +
                '}';
    }
}
