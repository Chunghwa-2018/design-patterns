package org.example.pattern;

/**
 * 奥迪汽车建造者
 *
 * @author zhaohongliang 2023-07-17 21:22
 * @since 1.0
 */
public class AudiCarBuilder extends Builder {


    @Override
    public void setBrandName() {
        car.setBrandName("Audi");
    }

    @Override
    public void setModel() {
        car.setModel("A6");
    }

    @Override
    public void setColor() {
        car.setColor(ColorEnum.BLACK.getColor());
    }

    @Override
    public void setInstructions() {
        car.setInstructions("Audi");
    }

    @Override
    public Car build() {
        return car;
    }
}
