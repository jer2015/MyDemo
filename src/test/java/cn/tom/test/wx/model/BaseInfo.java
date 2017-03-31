package cn.tom.test.wx.model;

/**
 * 发票的商家数据
 *
 * @author lxl
 */
public class BaseInfo {

    /**
     *
     */
    private Sku sku;

    /**
     * 显示在入口右侧的 tips，长度限制在 6 个汉字内 非必填
     */
    private String promotion_url_sub_title;

    /**
     * 发票商家 LOGO，请参考上传图片接口
     */
    private String logo_url;

    /**
     * 发票类型，填写广东增值税普通发票等,上限为 12 个汉字
     */
    private String brand_name;

    /**
     * 收款方(显示在列表)，上限为 9 个汉字，建议 填入商户简称
     */
    private String title;

    /**
     * 颜色，默认填写 Color100
     */
    private String color;

    /**
     * 发票二维码类型
     * 发票须填写 CODE_TYPE_NONE
     */
    private String code_type;

    /**
     * 发票使用说明。可以介绍电子发票的背景、报销、使用流程等
     */
    private String description;

    /**
     * 领取后是否支持转赠，为了避免法务风险，强烈 建议此处填写 false
     */
    private boolean can_give_friend;

    /**
     * 使用日期，有效期的信息，仅支持 DATE_TYPE_FIX_TIME_RANGE
     */
    private DateInfo date_info;

    /**
     * 发票平台自定义入口跳转外链的地址链接. 非必填
     * 发票外跳的链接会带有发票参数，用于标识是从那张 发票跳出的链接，详情请见备注 9.3。
     */
    private String custom_url;

    /**
     * 发票平台自定义入口名称， 非必填
     * 与 custom_url 字段共同使用，长度限制在 5 个汉字内
     */
    private String custom_url_name;

    /**
     * 领取前是否支持分享，为了避免法务风险，强烈 建议此处填写 false
     */
    private boolean can_share;

    /**
     * 入口跳转外链的地址链接. 非必填
     * 发票外跳的链接会带有发票参数，用于标识是从那张发票跳出的链接，详情请见备注 9.3。
     */
    private String promotion_url;

    /**
     * 显示在入口右侧的 tips，长度限制在 6 个汉字内 非必填
     */
    private String custom_url_sub_title;

    /**
     * 营销场景的自定义入口 非必填
     */
    private String promotion_url_name;

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public String getPromotion_url_sub_title() {
        return promotion_url_sub_title;
    }

    public void setPromotion_url_sub_title(String promotion_url_sub_title) {
        this.promotion_url_sub_title = promotion_url_sub_title;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCode_type() {
        return code_type;
    }

    public void setCode_type(String code_type) {
        this.code_type = code_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCan_give_friend() {
        return can_give_friend;
    }

    public void setCan_give_friend(boolean can_give_friend) {
        this.can_give_friend = can_give_friend;
    }

    public DateInfo getDate_info() {
        return date_info;
    }

    public void setDate_info(DateInfo date_info) {
        this.date_info = date_info;
    }

    public String getCustom_url() {
        return custom_url;
    }

    public void setCustom_url(String custom_url) {
        this.custom_url = custom_url;
    }

    public String getCustom_url_name() {
        return custom_url_name;
    }

    public void setCustom_url_name(String custom_url_name) {
        this.custom_url_name = custom_url_name;
    }

    public boolean isCan_share() {
        return can_share;
    }

    public void setCan_share(boolean can_share) {
        this.can_share = can_share;
    }

    public String getPromotion_url() {
        return promotion_url;
    }

    public void setPromotion_url(String promotion_url) {
        this.promotion_url = promotion_url;
    }

    public String getCustom_url_sub_title() {
        return custom_url_sub_title;
    }

    public void setCustom_url_sub_title(String custom_url_sub_title) {
        this.custom_url_sub_title = custom_url_sub_title;
    }

    public String getPromotion_url_name() {
        return promotion_url_name;
    }

    public void setPromotion_url_name(String promotion_url_name) {
        this.promotion_url_name = promotion_url_name;
    }
}

