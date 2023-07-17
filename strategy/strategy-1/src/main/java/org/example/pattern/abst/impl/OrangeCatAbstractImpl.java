package org.example.pattern.abst.impl;

import org.example.pattern.abst.CatAbstract;
import org.example.pattern.enums.CatColorEnum;

/**
 * 橘猫实现类
 *
 * @author zhaohongliang
 * @since 1.0
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
