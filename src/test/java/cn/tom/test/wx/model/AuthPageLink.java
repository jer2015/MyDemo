package cn.tom.test.wx.model;

/**
 * @author lxl
 */
public class AuthPageLink {

    /**
     * 开票平台 id，需要找开票平台提供
     */
    private String s_pappid;

    /**
     * 订单 id
     */
    private String order_id;

    /**
     * 订单金额，以分为单位
     */
    private int money;

    /**
     * 时间戳
     */
    private int timestamp;

    /**
     * 开票开源，app:app 开票，web:微信 h5 开票， wap:普通网页开票
     */
    private String source;

    /**
     * 授权成功后跳转页面 非必填
     */
    private String redirect_url;

    /**
     * Api_ticket，参考获取 api_ticket 接口获取
     */
    private String ticket;

    /**
     * 授权类型，0:开票授权，1:填写字段开票授权， 2:领票授权
     */
    private int type;

    public String getS_pappid() {
        return s_pappid;
    }

    public void setS_pappid(String s_pappid) {
        this.s_pappid = s_pappid;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

    public void setRedirect_url(String redirect_url) {
        this.redirect_url = redirect_url;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AuthPageLink{" +
                "s_pappid='" + s_pappid + '\'' +
                ", order_id='" + order_id + '\'' +
                ", money=" + money +
                ", timestamp=" + timestamp +
                ", source='" + source + '\'' +
                ", redirect_url='" + redirect_url + '\'' +
                ", ticket='" + ticket + '\'' +
                ", type=" + type +
                '}';
    }

}
