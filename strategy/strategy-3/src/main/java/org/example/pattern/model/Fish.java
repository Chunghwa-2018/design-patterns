package org.example.pattern.model;

/**
 * <p>鱼</p>
 *
 * @ClassName Fish
 * @Description 鱼
 * @Author zhaohongliang
 * @Date 2021-05-27 14:33
 * @Version 1.0
 */
public class Fish {

    /**
     * 名字
     */
    private String name;

    /**
     * 颜色
     */
    private String color;

    /**
     *  尺寸
     */
    private String size;


    /**
     * 获取 名字
     *
     * @return name 名字
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置 名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 颜色
     *
     * @return color 颜色
     */
    public String getColor() {
        return this.color;
    }

    /**
     * 设置 颜色
     *
     * @param color 颜色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取 尺寸
     *
     * @return size 尺寸
     */
    public String getSize() {
        return this.size;
    }

    /**
     * 设置 尺寸
     *
     * @param size 尺寸
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 无参构造器
     */
    public Fish() {
    }

    /**
     * 带参构造器
     *
     * @param name
     * @param color
     * @param size
     */
    public Fish(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
