package org.example.pattern.enums;

/**
 * 颜色枚举
 *
 * @author zhaohongliang
 * @since 1.0
 */
public enum CatColorEnum {

    /**
     * 黑色
     */
    BLACK("black", "黑猫"),

    /**
     * 橘色
     */
    ORANGE("orange", "橘猫");

    /**
     * 构造方法
     *
     * @param color
     * @param remark
     */
    CatColorEnum(String color, String remark) {
        this.color = color;
        this.remark = remark;
    }

    /**
     * 颜色
     */
    private String color;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取 颜色
     *
     * @return color 颜色
     */
    public String getColor() {
        return this.color;
    }

    /**
     * 设置 颜色
     *
     * @param color 颜色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取 备注
     *
     * @return remark 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置 备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
