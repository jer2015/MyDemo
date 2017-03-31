package cn.tom.test.wx.model;

import java.util.List;

/**
 * @author lxl
 */
public class UserField {
    /**
     * "show_title": 1,
     "show_phone": 1,
     "show_email": 1,
     "custom_field": [
     {
     "key": "field1"
     }
     ]
     */

    /**
     * 是否填写抬头，0 为否，1 为是
     * 非必填
     */
    private int show_title;

    /**
     * 是否填写电话号码，0 为否，1 为是
     * 非必填
     */
    private int show_phone;

    /**
     * 是否填写邮箱，0 为否，1 为是
     * 非必填
     */
    private int show_email;

    /**
     * 自定义字段
     * 自定义字段名称，最长 5 个字
     * 非必填
     */
    private List<CustomField> custom_field;

    public int getShow_title() {
        return show_title;
    }

    public void setShow_title(int show_title) {
        this.show_title = show_title;
    }

    public int getShow_phone() {
        return show_phone;
    }

    public void setShow_phone(int show_phone) {
        this.show_phone = show_phone;
    }

    public int getShow_email() {
        return show_email;
    }

    public void setShow_email(int show_email) {
        this.show_email = show_email;
    }

    public List<CustomField> getCustom_field() {
        return custom_field;
    }

    public void setCustom_field(List<CustomField> custom_field) {
        this.custom_field = custom_field;
    }

    @Override
    public String toString() {
        return "UserField{" +
                "show_title=" + show_title +
                ", show_phone=" + show_phone +
                ", show_email=" + show_email +
                ", custom_field=" + custom_field +
                '}';
    }
}
