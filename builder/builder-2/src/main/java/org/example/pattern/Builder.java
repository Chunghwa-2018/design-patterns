package org.example.pattern;

/**
 * 建造者
 *
 * @author zhaohongliang 2023-07-17 20:56
 * @since 1.0
 */
public abstract class Builder {

    protected Car car = new Car();

    /**
     * 设置品牌
     */
    public abstract void setBrandName();

    /**
     * 设置型号
     */
    public abstract void setModel();

    /**
     * 设置颜色
     */
    public abstract void setColor();

    /**
     * 设置介绍
     */
    public abstract void setInstructions();

    public abstract Car build();
}
