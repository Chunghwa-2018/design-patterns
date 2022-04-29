package org.example.pattern.abst.impl;

import org.example.pattern.abst.CatAbstract;
import org.example.pattern.enums.CatColorEnum;

/**
 * <p>橘猫实现类</p>
 *
 * @ClassName CatAbstractIml
 * @Description 橘猫实现类
 * @Author zhaohongliang
 * @Date 2021-02-09 17:35
 * @Version 1.0
 */
public class OrangeCatAbstractImpl implements CatAbstract {

    /**
     * 橘猫说
     *
     * @return
     */
    @Override
    public String say() {
        return "I'm an " + CatColorEnum.ORANGE.getColor() + " cat!";
    }
}
