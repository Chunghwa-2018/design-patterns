package org.example.pattern;

/**
 * 执行 main
 *
 * @author zhaohongliang 2023-07-17 21:15
 * @since 1.0
 */
public class TestMain {

    public static void main(String[] args) {

        Builder bmwBuilder = new BmwCarBuilder();
        Car car = bmwBuilder.build();
        System.out.println(car.toString());

        Builder audiBuilder = new AudiCarBuilder();
        Car audiCar = audiBuilder.build();
        System.out.println(audiCar.toString());
    }
}
