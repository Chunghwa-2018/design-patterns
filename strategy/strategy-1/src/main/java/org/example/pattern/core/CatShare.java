package org.example.pattern.core;



import org.example.pattern.abst.CatAbstract;
import org.example.pattern.abst.impl.BlackCatAbstractImpl;
import org.example.pattern.abst.impl.OrangeCatAbstractImpl;
import org.example.pattern.enums.CatColorEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * 分享方式
 *
 * @author zhaohongliang
 * @since 1.0
 */
public class CatShare {

    private static List<CatContext> catContextList = new ArrayList<CatContext>();

    // 静态块，先加载所有策略
    static {
        catContextList.add(new CatContext(CatColorEnum.BLACK.getColor(), new BlackCatAbstractImpl()));
        catContextList.add(new CatContext(CatColorEnum.ORANGE.getColor(), new OrangeCatAbstractImpl()));
    }

    /**
     * 选择猫的颜色
     *
     * @param color
     */
    public void shareOptions(String color) {
        CatAbstract catAbstract = null;
        for (CatContext context : catContextList) {
            if (context.getColor().equals(color)) {
                catAbstract = context.getCatAbstract();
                break;
            }
        }
        String sayStr = null;
        if (catAbstract != null) {
            sayStr= catAbstract.say();
        }
        System.out.println(sayStr);
    }

}
