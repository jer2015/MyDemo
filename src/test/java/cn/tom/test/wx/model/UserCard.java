package cn.tom.test.wx.model;

/**
 * @author lxl
 */
public class UserCard {
    private InvoiceUserData invoice_user_data;

    public InvoiceUserData getInvoice_user_data() {
        return invoice_user_data;
    }

    public void setInvoice_user_data(InvoiceUserData invoice_user_data) {
        this.invoice_user_data = invoice_user_data;
    }

    @Override
    public String toString() {
        return "UserCard{" +
                "invoice_user_data=" + invoice_user_data +
                '}';
    }
}
