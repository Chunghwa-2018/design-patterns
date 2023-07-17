package org.example.pattern;


/**
 * 颜色枚举
 *
 * @author zhaohongliang
 * @since 1.0
 */
public enum CarColorEnum {

    BLACK("black", "黑色汽车"),

    RED("red", "红色汽车");

    /**
     * 颜色
     */
    private final String color;

    /**
     * 备注
     */
    private final String remark;

    /**
     * 带参构造器
     *
     * @param color
     * @param remark
     */
     CarColorEnum(String color, String remark) {
        this.color = color;
        this.remark = remark;
    }

    public String getColor() {
        return color;
    }

    public String getRemark() {
        return remark;
    }
}
