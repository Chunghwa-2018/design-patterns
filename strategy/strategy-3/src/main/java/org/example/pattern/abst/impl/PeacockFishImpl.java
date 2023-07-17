package org.example.pattern.abst.impl;

import org.example.pattern.abst.FishAbstract;
import org.example.pattern.model.Fish;

/**
 * 孔雀鱼抽象策略接口实现
 *
 * @author zhaohongliang
 * @since 1.0
 */
public class PeacockFishImpl implements FishAbstract {

    /**
     * 获取一条孔雀鱼的实例
     *
     * @param name 名字
     * @param color 颜色
     * @param size 尺寸
     * @return
     */
    @Override
    public Fish getFish(String name, String color, String size) {
        Fish fish = new Fish(name, color, size);
        return fish;
    }
}
