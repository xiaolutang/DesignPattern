package com.txl.designpattern.strategymode.demo;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/3 20:32
 * @Description:打折收费子类
 */
public class CashRebate extends CashSuper {
    private double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
