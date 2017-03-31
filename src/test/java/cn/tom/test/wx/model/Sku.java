package cn.tom.test.wx.model;

/**
 * @author lxl
 */
public class Sku {
    /**
     *
     */
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sku{" +
                "quantity=" + quantity +
                '}';
    }
}
