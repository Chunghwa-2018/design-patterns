package org.example.pattern;

import org.example.pattern.enums.CarColorEnum;

/**
 * 策略模式
 *
 * @author zhaohongliang
 * @since 1.0
 */
public class Strategy {

    public static void main(String[] args) {

        // 方式一
        String blacResult1 = CarColorEnum.valueOf("BLACK").getCarAbstract().run();
        System.out.println(blacResult1);
        String redResult1 = CarColorEnum.valueOf("RED").getCarAbstract().run();
        System.out.println(redResult1);

        // 方式二
        String blackResult2 = CarColorEnum.match("black").run();
        System.out.println(blackResult2);
        String redResult2 = CarColorEnum.match("red").run();
        System.out.println(redResult2);

    }
}
