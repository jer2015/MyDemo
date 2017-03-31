package cn.tom.test.wx.model;

/**
 * 商品详情结构
 *
 * @author lxl
 */
public class InvoiceInfo {

    /**
     * 项目的名称
     */
    private String name;

    /**
     * 项目的数量
     */
    private String num;

    /**
     * 项目的单位
     */
    private String unit;

    /**
     * 项目的单价
     */
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InvoiceInfo{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", unit='" + unit + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
