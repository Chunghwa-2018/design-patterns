package org.example.pattern.abst;

import org.example.pattern.model.Fish;

/**
 * 鱼的抽象策略接口
 *
 * @author zhaohongliang
 * @since 1.0
 */
public interface FishAbstract {

    /**
     * 获取 fish
     *
     * @param name 名字
     * @param color 颜色
     * @param size 尺寸
     * @return
     */
    Fish getFish(String name, String color, String size);
}
