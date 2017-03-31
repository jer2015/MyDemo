package cn.tom.test.wx.model;

import java.util.List;

/**
 * @author lxl
 */
public class BizField {

    /**
     * 是否填写抬头，0 为否，1 为是
     * 非必填
     */
    private int show_title;

    /**
     * 是否填写税号，0 为否，1 为是
     * 非必填
     */
    private int show_tax_no;

    /**
     * 是否填写单位地址，0 为否，1 为是
     * 非必填
     */
    private int show_addr;

    /**
     * 是否填写电话号码，0 为否，1 为是
     * 非必填
     */
    private int show_phone;

    /**
     * 是否填写开户银行，0 为否，1 为是
     * 非必填
     */
    private int show_bank_type;

    /**
     * 是否填写银行帐号，0 为否，1 为是
     * 非必填
     */
    private int show_bank_no;

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

    public int getShow_tax_no() {
        return show_tax_no;
    }

    public void setShow_tax_no(int show_tax_no) {
        this.show_tax_no = show_tax_no;
    }

    public int getShow_addr() {
        return show_addr;
    }

    public void setShow_addr(int show_addr) {
        this.show_addr = show_addr;
    }

    public int getShow_phone() {
        return show_phone;
    }

    public void setShow_phone(int show_phone) {
        this.show_phone = show_phone;
    }

    public int getShow_bank_type() {
        return show_bank_type;
    }

    public void setShow_bank_type(int show_bank_type) {
        this.show_bank_type = show_bank_type;
    }

    public int getShow_bank_no() {
        return show_bank_no;
    }

    public void setShow_bank_no(int show_bank_no) {
        this.show_bank_no = show_bank_no;
    }

    public List<CustomField> getCustom_field() {
        return custom_field;
    }

    public void setCustom_field(List<CustomField> custom_field) {
        this.custom_field = custom_field;
    }

    @Override
    public String toString() {
        return "BizField{" +
                "show_title=" + show_title +
                ", show_tax_no=" + show_tax_no +
                ", show_addr=" + show_addr +
                ", show_phone=" + show_phone +
                ", show_bank_type=" + show_bank_type +
                ", show_bank_no=" + show_bank_no +
                ", custom_field=" + custom_field +
                '}';
    }
}
