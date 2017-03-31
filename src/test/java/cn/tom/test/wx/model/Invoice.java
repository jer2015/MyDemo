package cn.tom.test.wx.model;

/**
 * @author lxl
 */
public class Invoice {
    /**
     * 收款方(开票方)全称，显示在发票详情内
     */
    private String payee;

    private BaseInfo base_info;

    /**
     * 发票详情字段，预留字段，建议填入发票使用说 明
     */
    private String detail;

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public BaseInfo getBase_info() {
        return base_info;
    }

    public void setBase_info(BaseInfo base_info) {
        this.base_info = base_info;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "payee='" + payee + '\'' +
                ", base_info=" + base_info +
                ", detail='" + detail + '\'' +
                '}';
    }
}
