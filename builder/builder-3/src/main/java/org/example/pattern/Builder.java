package org.example.pattern;

/**
 * 建造者
 *
 * @author zhaohongliang 2023-07-17 20:56
 * @since 1.0
 */
public class Builder {

    /**
     * 品牌
     */
    private final String brandName;

    /**
     * 型号
     */
    private final String model;

    /**
     * 颜色
     * @see ColorEnum
     */
    private final String color;

    /**
     * 介绍
     */
    private final String instructions;


    public Builder() {
        this.brandName = null;
        this.model = null;
        this.color = null;
        this.instructions = null;
    }

    public Builder(String brandName, String model, String color, String instructions) {
        this.brandName = brandName;
        this.model = model;
        this.color = color;
        this.instructions = instructions;
    }

    public static Builder create() {
        return new Builder();
    }

    public Car build() {
        return new Car(this);
    }

    public Builder setBrandName(String brandName) {
        return new Builder(brandName, this.model, this.color, this.instructions);
    }

    public Builder setModel(String model) {
        return new Builder(this.brandName, model, this.color, this.instructions);
    }

    public Builder setColor(String color) {
        return new Builder(this.brandName, this.model, color, this.instructions);
    }

    public Builder setInstructions(String instructions) {
        return new Builder(this.brandName, this.model, this.color, instructions);
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getInstructions() {
        return instructions;
    }
}
