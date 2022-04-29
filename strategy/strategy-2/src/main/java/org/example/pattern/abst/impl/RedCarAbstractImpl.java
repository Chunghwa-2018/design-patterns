package org.example.pattern.abst.impl;

import org.example.pattern.abst.CarAbstract;
import org.example.pattern.enums.CarColorEnum;

/**
 * <p>红色汽车的接口实现</p>
 *
 * @ClassName RedCarAbstractImpl
 * @Description 红色汽车的接口实现
 * @Author zhaohongliang
 * @Date 2021-02-10 10:06
 * @Version 1.0
 */
public class RedCarAbstractImpl implements CarAbstract {

    /**
     * 红色汽车在跑
     *
     * @return
     */
    @Override
    public String run() {
        return "I'm a " + CarColorEnum.RED.getColor() + " car!";
    }
}
