package org.example.pattern;

/**
 * 单例-双重校验加锁-线程安全
 * instance 只需要被实例化一次，之后就可以直接使用了。加锁操作只需要对实例化那部分的代码进行，只有当 instance 没有被实例化时，才需要进行加锁。
 * 双重校验锁先判断 instance 是否已经被实例化，如果没有被实例化，那么才对实例化语句进行加锁。
 *
 * @author zhaohongliang
 * @since 1.0
 */
public class DoubleCheckSingletonSafe {

    /**
     * 私有静态属性 instance，但不创建对象
     * instance 采用 volatile 关键字修饰也是很有必要的， uniqueInstance = new Singleton(); 这段代码其实是分为三步执行
     * 1、为 uniqueInstance 分配内存空间
     * 2、初始化 uniqueInstance
     * 3、将 uniqueInstance 指向分配的内存地址
     * 但是由于 JVM 具有指令重排的特性，执行顺序有可能变成 1>3>2。指令重排在单线程环境下不会出现问题，但是在多线程环境下会导致一个线程获得还没有初始化的实例。例如，线程 T1 执行了 1 和 3，
     * 此时 T2  调用 getUniqueInstance() 后发现 uniqueInstance 不为空，因此返回 uniqueInstance，但此时 uniqueInstance 还未被初始化。
     * 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
     */
    private volatile static DoubleCheckSingletonSafe instance;

    /**
     * 私有无参构造方法，避免外部创建
     */
    private DoubleCheckSingletonSafe() {}

    /**
     * 公有静态方法
     *
     * @return
     */
    public static DoubleCheckSingletonSafe getInstance() {
        // 避免每次加锁，只有第一次没有创建对象时才加锁
        if (instance == null) {
            synchronized(DoubleCheckSingletonSafe.class) { // 加锁，只允许第一个线程家进入
                // 如果不进行第二次判断，两个线程同时发生，会进行两次实例化操作
                if (instance == null) {
                    instance = new DoubleCheckSingletonSafe();     // 只创建一次对象
                }
            }
        }
        return instance;
    }
}
