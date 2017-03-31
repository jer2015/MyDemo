package cn.tom.test.wx.model;

/**
 * 发票信息部分
 *
 * @author lxl
 */
public class InvoiceCard {
    /**
     * 发票类型，固定填写 INVOICE
     */
    private String card_type;

    /**
     * 发票的商家数据
     */
    private Invoice invoice;

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "InvoiceCard{" +
                "card_type='" + card_type + '\'' +
                ", invoice=" + invoice +
                '}';
    }
}
