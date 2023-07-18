package org.example.pattern;

/**
 * 汽车
 *
 * @author zhaohongliang 2023-07-17 21:04
 * @since 1.0
 */
public class Car {

    /**
     * 品牌
     */
    private String brandName;

    /**
     * 型号
     */
    private String model;

    /**
     * 颜色
     * @see ColorEnum
     */
    private String color;

    /**
     * 介绍
     */
    private String instructions;

    public Car() {
    }

    public Car(String brandName, String model, String color, String instructions) {
        this.brandName = brandName;
        this.model = model;
        this.color = color;
        this.instructions = instructions;
    }

    public Car(Builder builder) {
        this.brandName = builder.brandName;
        this.model = builder.model;
        this.color = builder.color;
        this.instructions = builder.instructions;
    }

    public static final class Builder {
        /**
         * 品牌
         */
        private String brandName;

        /**
         * 型号
         */
        private String model;

        /**
         * 颜色
         * @see ColorEnum
         */
        private String color;

        /**
         * 介绍
         */
        private String instructions;


        public Car build() {
            return new Car(this);
        }


        public Builder setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setInstructions(String instructions) {
            this.instructions = instructions;
            return this;
        }
    }



    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }

}
