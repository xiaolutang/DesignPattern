package com.txl.designpattern.strategymode;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/3 7:26
 * @Description:
 */
public class ConcreteStrategyA extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("实现A算法");
    }
}
