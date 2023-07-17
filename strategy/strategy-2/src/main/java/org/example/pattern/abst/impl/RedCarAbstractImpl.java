package org.example.pattern.abst.impl;

import org.example.pattern.abst.CarAbstract;
import org.example.pattern.enums.CarColorEnum;

/**
 * 红色汽车的接口实现
 *
 * @author zhaohongliang
 * @since 1.0
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
