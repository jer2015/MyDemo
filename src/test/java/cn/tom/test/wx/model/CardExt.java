package cn.tom.test.wx.model;

/**
 * 发票具体内容
 *
 * @author lxl
 */
public class CardExt {
    /**
     * 自定义渠道参数，会通过用户领取发票的事件推 送给开发者
     */
    private String outer_str;

    /**
     * 发票 code
     */
    private String code;

    /**
     * 随机字符串，防止重入
     */
    private String nonce_str;

    /**
     * 用户信息结构体
     */
    private UserCard user_card;

    public String getOuter_str() {
        return outer_str;
    }

    public void setOuter_str(String outer_str) {
        this.outer_str = outer_str;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public UserCard getUser_card() {
        return user_card;
    }

    public void setUser_card(UserCard user_card) {
        this.user_card = user_card;
    }

    @Override
    public String toString() {
        return "CardExt{" +
                "outer_str='" + outer_str + '\'' +
                ", code='" + code + '\'' +
                ", nonce_str='" + nonce_str + '\'' +
                ", user_card=" + user_card +
                '}';
    }
}
