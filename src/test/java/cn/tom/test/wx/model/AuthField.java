package cn.tom.test.wx.model;

/**
 * @author lxl
 */
public class AuthField {

    /**
     * 授权页个人发票字段
     */
    private UserField user_field;

    /**
     * 授权页单位发票字段
     */
    private BizField biz_field;

    public UserField getUser_field() {
        return user_field;
    }

    public void setUser_field(UserField user_field) {
        this.user_field = user_field;
    }

    public BizField getBiz_field() {
        return biz_field;
    }

    public void setBiz_field(BizField biz_field) {
        this.biz_field = biz_field;
    }

    @Override
    public String toString() {
        return "AuthField{" +
                "user_field=" + user_field +
                ", biz_field=" + biz_field +
                '}';
    }
}
