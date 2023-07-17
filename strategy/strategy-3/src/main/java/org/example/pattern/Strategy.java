package org.example.pattern;


import org.example.pattern.abst.impl.PeacockFishImpl;
import org.example.pattern.abst.impl.ZebraFishImpl;
import org.example.pattern.core.FishContext;
import org.example.pattern.model.Fish;

/**
 * 策略模式
 *
 * @author zhaohongliang
 * @since 1.0
 */
public class Strategy {

    public static void main(String[] args) {

        FishContext peacockContext = new FishContext(new PeacockFishImpl());
        Fish peacock = peacockContext.produce("孔雀001", "红色", "2-3cm");
        System.out.println(peacock.toString());

        FishContext zebraContext = new FishContext(new ZebraFishImpl());
        Fish zebra = zebraContext.produce("斑马001", "蓝色", "2-3cm");
        System.out.println(zebra.toString());

    }
}
