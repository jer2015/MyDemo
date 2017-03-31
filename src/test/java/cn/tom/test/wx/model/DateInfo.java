package cn.tom.test.wx.model;

/**
 * @author lxl
 */
public class DateInfo {

    /**
     * 使用时间的类型，仅支持选择一种时间类型的字段填入
     * DATE_TYPE_FIX_TIME_RANGE 表示固定日期区间
     */
    private String type;

    /**
     * DATE_TYPE_FIX_TIME_RANGE 时专用，表示 起用时间。
     * 从 1970 年 1 月 1 日 00:00:00 至起用 时间的秒数，最终需转换为字符串形态传入，下 同。(单位为秒)
     */
    private long begin_timestamp;

    /**
     * DATE_TYPE_FIX_TIME_RANGE 时专用，表示 结束时间。(单位为秒)
     */
    private long end_timestamp;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBegin_timestamp() {
        return begin_timestamp;
    }

    public void setBegin_timestamp(long begin_timestamp) {
        this.begin_timestamp = begin_timestamp;
    }

    public long getEnd_timestamp() {
        return end_timestamp;
    }

    public void setEnd_timestamp(long end_timestamp) {
        this.end_timestamp = end_timestamp;
    }

    @Override
    public String toString() {
        return "DateInfo{" +
                "type='" + type + '\'' +
                ", begin_timestamp=" + begin_timestamp +
                ", end_timestamp=" + end_timestamp +
                '}';
    }
}
