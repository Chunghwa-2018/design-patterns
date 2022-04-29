package org.example.pattern;

/**
 * <p>单例-懒汉式-线程不安全</p>
 *
 * @ClassName LazySingleton
 * @Description 以下实现中，私有静态变量 instance 被延迟实例化，这样做的好处是，如果没有用到该类，那么就不会实例化 instance，从而节约资源
 * 这个实现在多线程环境下是不安全的，如果多个线程能够同时进入 if (instance == null) ，并且此时 instance 为 null，那么会有多个线程执行 instance = new Singleton(); 语句，这将导致实例化多次 instance
 * @Author zhaohongliang
 * @Date 2021-02-09 16:36
 * @Version 1.0
 */
public class LazySingletonUnsafe {

    /**
     * 私有静态属性 instance，但不创建对象
     */
    private static LazySingletonUnsafe instance;

    /**
     * 私有无参数构造方法，避免外部创建
     */
    private LazySingletonUnsafe() {

    }

    // 公有静态方法
    private static LazySingletonUnsafe getInstance() {
        // 判断是否为首次创建对象
        if (instance == null) {
            instance = new LazySingletonUnsafe();
        }
        return instance;
    }
}
