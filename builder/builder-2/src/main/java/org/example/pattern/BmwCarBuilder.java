package org.example.pattern;

/**
 * 宝马汽车建造者
 *
 * @author zhaohongliang 2023-07-17 20:38
 * @since 1.0
 */
public class BmwCarBuilder extends Builder {

    @Override
    public void setBrandName(String brandName) {
        car.setBrandName(brandName);
    }

    @Override
    public void setModel(String model) {
        car.setModel(model);
    }

    @Override
    public void setColor(String color) {
        car.setColor(color);
    }

    @Override
    public void setInstructions(String instructions) {
        car.setInstructions(instructions);
    }

    @Override
    public Car build() {
        return car;
    }
}
