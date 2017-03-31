package cn.tom.test.wx.model;

/**
 * 将发票插入用户卡包model
 *
 * @author lxl
 */
public class InsertCard {
    /**
     * 发票 order_id
     */
    private String order_id;

    /**
     * 发票 card_id
     */
    private String card_id;

    /**
     * 该订单号授权时使用的 appid，一般为商户 appid
     */
    private String appid;

    /**
     * 发票具体内容
     */
    private CardExt card_ext;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public CardExt getCard_ext() {
        return card_ext;
    }

    public void setCard_ext(CardExt card_ext) {
        this.card_ext = card_ext;
    }

    @Override
    public String toString() {
        return "InsertCard{" +
                "order_id='" + order_id + '\'' +
                ", card_id='" + card_id + '\'' +
                ", appid='" + appid + '\'' +
                ", card_ext=" + card_ext +
                '}';
    }
}
