package org.example.pattern;

/**
 * 奥迪汽车建造者
 *
 * @author zhaohongliang 2023-07-17 21:22
 * @since 1.0
 */
public class AudiCarBuilder extends Builder {


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
