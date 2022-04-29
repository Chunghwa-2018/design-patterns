package org.example.pattern.enums;

import org.example.pattern.abst.CarAbstract;
import org.example.pattern.abst.impl.BlackCarAbstractImpl;
import org.example.pattern.abst.impl.RedCarAbstractImpl;

/**
 * <p>颜色枚举</p>
 *
 * @ClassName CarColorEnum
 * @Description 颜色枚举
 * @Author zhaohongliang
 * @Date 2021-02-10 09:56
 * @Version 1.0
 */
public enum CarColorEnum {

    BLACK("black", "黑色汽车", new BlackCarAbstractImpl()),

    RED("red", "红色汽车", new RedCarAbstractImpl());

    /**
     * 颜色
     */
    private String color;

    /**
     * 备注
     */
    private String remark;

    /**
     * 汽车的抽象接口
     */
    private CarAbstract carAbstract;

    /**
     * 带参构造器
     *
     * @param color
     * @param remark
     * @param carAbstract
     */
    CarColorEnum(String color, String remark, CarAbstract carAbstract) {
        this.color = color;
        this.remark = remark;
        this.carAbstract = carAbstract;
    }

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

    /**
     * 获取 汽车的抽象接口
     *
     * @return carAbstract 汽车的抽象接口
     */
    public CarAbstract getCarAbstract() {
        return this.carAbstract;
    }

    /**
     * 设置 汽车的抽象接口
     *
     * @param carAbstract 汽车的抽象接口
     */
    public void setCarAbstract(CarAbstract carAbstract) {
        this.carAbstract = carAbstract;
    }

    /**
     * 根据 颜色 匹配对应实现
     *
     * @param color
     * @return
     */
    public static CarAbstract match(String color) {
        // CarColorEnum[] carColorEnums = CarColorEnum.values();
        // CarColorEnum[] carColorEnums = values();
        // CarColorEnum[] carColorEnums = CarColorEnum.values();
        for (CarColorEnum carColor : CarColorEnum.values()) {
            if (carColor.getColor().equals(color)) {
                return carColor.getCarAbstract();
            }
        }
        return null;
    }
}
