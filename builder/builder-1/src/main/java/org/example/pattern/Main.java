package org.example.pattern;

/**
 * 执行 main
 *
 * @author zhaohongliang 2023-07-17 21:15
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        Builder bmwBuilder = new BmwCarBuilder();
        Director bmwDirector = new Director(bmwBuilder);
        Car bmwCar = bmwDirector.build("BMW", "E-x", CarColorEnum.RED.getColor(), "性能非常棒");
        System.out.println(bmwCar.toString());

        Builder audiBuilder = new AudiCarBuilder();
        Director audiDirector = new Director(audiBuilder);
        Car audiCar = audiDirector.build("Audi", "S-x", CarColorEnum.BLACK.getColor(), "碾压其他");
        System.out.println(audiCar.toString());
    }
}
