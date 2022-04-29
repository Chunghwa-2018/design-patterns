package org.example.pattern;

import org.example.pattern.core.CatShare;
import org.example.pattern.enums.CatColorEnum;

/**
 * <p>策略模式</p>
 *
 * @ClassName Strategy
 * @Description 策略模式
 * @Author zhaohongliang
 * @Date 2021-02-09 17:24
 * @Version 1.0
 */
public class Strategy {

    public static void main(String[] args) {
        CatShare catShare = new CatShare();
        catShare.shareOptions(CatColorEnum.BLACK.getColor());
        catShare.shareOptions(CatColorEnum.ORANGE.getColor());
    }
}
