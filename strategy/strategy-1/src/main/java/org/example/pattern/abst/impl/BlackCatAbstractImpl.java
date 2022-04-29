package org.example.pattern.abst.impl;

import org.example.pattern.abst.CatAbstract;
import org.example.pattern.enums.CatColorEnum;

/**
 * <p>黑猫实现类</p>
 *
 * @ClassName BlackCatAbstractImpl
 * @Description 黑猫实现类
 * @Author zhaohongliang
 * @Date 2021-02-09 17:38
 * @Version 1.0
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
