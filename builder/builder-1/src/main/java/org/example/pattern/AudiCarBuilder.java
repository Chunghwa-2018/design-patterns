package org.example.pattern;

/**
 * 奥迪汽车建造者
 *
 * @author zhaohongliang 2023-07-17 21:22
 * @since 1.0
 */
public class AudiCarBuilder implements Builder {

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
     * @see CarColorEnum
     */
    private String color;

    /**
     * 介绍
     */
    private String instructions;


    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public Car build() {
        Car car = new Car();
        car.setBrandName(brandName);
        car.setModel(model);
        car.setColor(color);
        car.setInstructions(instructions);
        return car;
    }
}
