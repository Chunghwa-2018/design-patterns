package org.example.pattern;

/**
 * 建造者
 *
 * @author zhaohongliang 2023-07-17 20:56
 * @since 1.0
 */
public interface Builder {

    /**
     * 设置品牌
     *
     * @param brandName
     */
    public void setBrandName(String brandName);

    /**
     * 设置型号
     *
     * @param model
     */
    public void setModel(String model);

    /**
     * 设置颜色
     *
     * @param color
     */
    public void setColor(String color);

    /**
     * 设置介绍
     *
     * @param instructions
     */
    public void setInstructions(String instructions);

    public Car build();
}
