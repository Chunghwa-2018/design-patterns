package org.example.pattern;

/**
 * <p>单例-懒汉式-线程安全</p>
 *
 * @ClassName LazySingletonSafe2
 * @Description 只需要对 getInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了实例化多次 instance。
 * 但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，即使 instance 已经被实例化了。这会让线程阻塞时间过长，因此该方法有性能问题，不推荐使用。
 * @Author zhaohongliang
 * @Date 2021-02-09 16:50
 * @Version 1.0
 */
public class LazySingletonSafe {

    /**
     * 私有静态属性 instance，但不创建对象
     */
    private static LazySingletonSafe instance;

    /**
     * 私有无参构造犯法，避免外部创建
     */
    private LazySingletonSafe() {

    }

    /**
     * 公有静态方法
     *
     * @return
     */
    public static synchronized LazySingletonSafe getInstance() {
        // 判断是否为首次创建对象
        if (instance == null) {
            instance = new LazySingletonSafe();
        }
        return instance;
    }
}
