package com.txl.designpattern.proxy;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/12 22:49
 * @Description:
 */
public class Proxy implements IGiveGift{
    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlows() {
        gg.giveFlows();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
