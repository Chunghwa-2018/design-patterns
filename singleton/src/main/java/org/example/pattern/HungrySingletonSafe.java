package org.example.pattern;

/**
 * <p>单例-饿汉式-线程安全</p>
 *
 * @ClassName HungrySingletonSafe
 * @Description 线程不安全问题主要是由于 instance 被实例化多次，采取直接实例化 instance 的方式就不会产生线程不安全问题。
 * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。
 * @Author zhaohongliang
 * @Date 2021-02-09 16:44
 * @Version 1.0
 */
public class HungrySingletonSafe {

    /**
     * 私有静态属性 instance，并创建对象
     */
    private static HungrySingletonSafe instance = new HungrySingletonSafe();

    /**
     * 私有无参构造方法，避免外部创建实例
     */
    private HungrySingletonSafe() {

    }

    /**
     * 公有静态方法
     *
     * @return
     */
    public static HungrySingletonSafe getInstance() {
        return instance;
    }
}
