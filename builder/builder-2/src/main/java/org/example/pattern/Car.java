package org.example.pattern;

/**
 * 汽车
 *
 * @author zhaohongliang 2023-07-17 21:04
 * @since 1.0
 */
public class Car {

    /**
     * 品牌
     */
    private String brandName;

    /**
     * 型号
     */
    private String model;

    /**
     * 颜色
     * @see ColorEnum
     */
    private String color;

    /**
     * 介绍
     */
    private String instructions;

    public Car() {
    }

    public Car(String brandName, String model, String color, String instructions) {
        this.brandName = brandName;
        this.model = model;
        this.color = color;
        this.instructions = instructions;
    }


    /**
     * 获取 品牌
     *
     * @return brandName 品牌
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * 设置 品牌
     *
     * @param brandName 品牌
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 获取 型号
     *
     * @return model 型号
     */
    public String getModel() {
        return this.model;
    }

    /**
     * 设置 型号
     *
     * @param model 型号
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取 颜色      @see ColorEnum
     *
     * @return color 颜色      @see ColorEnum
     */
    public String getColor() {
        return this.color;
    }

    /**
     * 设置 颜色      @see ColorEnum
     *
     * @param color 颜色      @see ColorEnum
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取 介绍
     *
     * @return instructions 介绍
     */
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * 设置 介绍
     *
     * @param instructions 介绍
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
