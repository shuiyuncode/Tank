package com.lsp.tank.entity.abstractFactory;

import com.lsp.tank.entity.Dir;
import com.lsp.tank.entity.Group;
import com.lsp.tank.entity.TankFrame;

/**
 * @author ：Lisp
 * @date： 2021/8/23
 * @version: V1.0
 * @slogan:
 * @Description 生产方形风格的坦克、子弹和爆炸效果的工厂类
 *              抽象工厂可以创建一套的产品
 */
public class RectFactory extends GameFactory {
    @Override
    public BaseTank createTank(int x, int y, Dir dir, Group group, TankFrame tankFrame) {
        return new RectTank(x,y,dir,group,tankFrame);
    }

    @Override
    public BaseBullet createBullet(int x, int y, Dir dir, Group group, TankFrame tankFrame) {
        return new RectBullet(x,y,dir,group,tankFrame);
    }

    @Override
    public BaseExplode createExplode(int x, int y, TankFrame tankFrame) {
        return new RectExplode(x, y, tankFrame);
    }
}