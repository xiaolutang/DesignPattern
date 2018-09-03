package com.txl.designpattern.strategymode.demo;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/3 20:30
 * @Description:正常收费
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
