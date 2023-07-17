package org.example.pattern;

import org.example.pattern.core.CatShare;
import org.example.pattern.enums.CatColorEnum;

/**
 * 策略模式
 *
 * @author zhaohongliang
 * @since 1.0
 */
public class Strategy {

    public static void main(String[] args) {
        CatShare catShare = new CatShare();
        catShare.shareOptions(CatColorEnum.BLACK.getColor());
        catShare.shareOptions(CatColorEnum.ORANGE.getColor());
    }
}
