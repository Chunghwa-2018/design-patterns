package org.example.pattern;

/**
 * 执行 main
 *
 * @author zhaohongliang 2023-07-18 17:01
 * @since 1.0
 */
public class TestMain {

    public static void main(String[] args) {
        Car car = Builder.create()
                .setBrandName("Audi")
                .setModel("A6")
                .setColor(ColorEnum.BLACK.getColor())
                .setInstructions("Audi")
                .build();
        System.out.println(car);
    }
}
