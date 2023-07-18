package org.example.pattern;

/**
 * 经理
 *
 * @author zhaohongliang 2023-07-17 21:02
 * @since 1.0
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }


    public Car build() {
        builder.setBrandName();
        builder.setModel();
        builder.setColor();
        builder.setInstructions();
        return builder.build();
    }

}
