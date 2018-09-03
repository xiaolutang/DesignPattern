package com.txl.designpattern.strategymode;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/3 7:29
 * @Description:
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
