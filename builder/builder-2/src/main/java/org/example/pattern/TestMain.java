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
        Director bmwDirector = new Director(bmwBuilder);
        Car bmwCar = bmwDirector.build();
        System.out.println(bmwCar.toString());

        Builder audiBuilder = new AudiCarBuilder();
        Director audiDirector = new Director(audiBuilder);
        Car audiCar = audiDirector.build();
        System.out.println(audiCar.toString());
    }
}
