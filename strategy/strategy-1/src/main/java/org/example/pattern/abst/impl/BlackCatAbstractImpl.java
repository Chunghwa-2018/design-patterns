package org.example.pattern.abst.impl;

import org.example.pattern.abst.CatAbstract;
import org.example.pattern.enums.CatColorEnum;

/**
 * 黑猫实现类
 *
 * @author zhaohongliang
 * @since 1.0
 */
public class BlackCatAbstractImpl implements CatAbstract {

    /**
     * 黑猫说
     *
     * @return
     */
    @Override
    public String say() {
        return "I'm a " + CatColorEnum.BLACK.getColor() + " cat!";
    }
}
