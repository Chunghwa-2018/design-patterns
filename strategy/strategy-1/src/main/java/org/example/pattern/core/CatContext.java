package org.example.pattern.core;

import org.example.pattern.abst.CatAbstract;

/**
 * 猫的上下文
 *
 * @author zhaohongliang
 * @since 1.0
 */
public class CatContext {

    /**
     * 颜色
     */
    private String color;

    /**
     * 猫的抽象策略类
     */
    private CatAbstract catAbstract;

    /**
     * 无参构造器
     */
    public CatContext() {
    }

    /**
     * 带参构造器
     *
     * @param color
     * @param catAbstract
     */
    public CatContext(String color, CatAbstract catAbstract) {
        this.color = color;
        this.catAbstract = catAbstract;
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
     * 获取 猫的抽象策略类
     *
     * @return catAbstract 猫的抽象策略类
     */
    public CatAbstract getCatAbstract() {
        return this.catAbstract;
    }

    /**
     * 设置 猫的抽象策略类
     *
     * @param catAbstract 猫的抽象策略类
     */
    public void setCatAbstract(CatAbstract catAbstract) {
        this.catAbstract = catAbstract;
    }

    /**
     * 猫说
     *
     * @return
     */
    public String say() {
        return catAbstract.say();
    }

}
