package cn.tom.test.wx.model;

/**
 * 创建发票
 *
 * @author lxl
 */
public class CreateInvoice {
    private InvoiceCard card;

    public InvoiceCard getCard() {
        return card;
    }

    public void setCard(InvoiceCard card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "CreateInvoice{" +
                "card=" + card +
                '}';
    }
}
