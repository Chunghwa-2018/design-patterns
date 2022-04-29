package org.example.pattern.abst;

import org.example.pattern.model.Fish;

/**
 * <p>鱼的抽象策略接口</p>
 *
 * @ClassName FishAbstract
 * @Description 鱼的抽象策略接口
 * @Author zhaohongliang
 * @Date 2021-05-27 14:31
 * @Version 1.0
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
