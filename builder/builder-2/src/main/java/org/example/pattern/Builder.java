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
     *
     * @param brandName
     */
    public abstract void setBrandName(String brandName);

    /**
     * 设置型号
     *
     * @param model
     */
    public abstract void setModel(String model);

    /**
     * 设置颜色
     *
     * @param color
     */
    public abstract void setColor(String color);

    /**
     * 设置介绍
     *
     * @param instructions
     */
    public abstract void setInstructions(String instructions);

    public abstract Car build();
}
