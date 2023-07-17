package org.example.pattern.core;

import org.example.pattern.abst.FishAbstract;
import org.example.pattern.model.Fish;

/**
 * 鱼上下文
 *
 * @author zhaohongliang
 * @since 1.0
 */
public class FishContext {

    /**
     * 抽象类接口
     */
    private FishAbstract fishAbstract;

    /**
     * 带参构造器
     *
     * @param fishAbstract
     */
    public FishContext(FishAbstract fishAbstract) {
        this.fishAbstract = fishAbstract;
    }

    /**
     * 生产方法
     *
     * @param name
     * @param color
     * @param size
     * @return
     */
    public Fish produce(String name, String color, String size) {
       return fishAbstract.getFish(name, color, size);
    }
}
