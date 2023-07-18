package org.example.pattern;

/**
 * 宝马汽车建造者
 *
 * @author zhaohongliang 2023-07-17 20:38
 * @since 1.0
 */
public class BmwCarBuilder extends Builder {

    @Override
    public void setBrandName() {
        car.setBrandName("BMW");
    }

    @Override
    public void setModel() {
        car.setModel("5X");
    }

    @Override
    public void setColor() {
        car.setColor(ColorEnum.RED.getColor());
    }

    @Override
    public void setInstructions() {
        car.setInstructions("BMW");
    }

    @Override
    public Car build() {
        return car;
    }
}
