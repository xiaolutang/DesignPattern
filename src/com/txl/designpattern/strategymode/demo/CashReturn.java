package com.txl.designpattern.strategymode.demo;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/3 20:33
 * @Description: 返利收费子类
 */
public class CashReturn extends CashSuper{
    /**
     * 返利条件，例如满300 返100 则moneyCondition=300，moneyReturn=100
     * */
    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money > moneyCondition){
            result = money - Math.floor(money/moneyCondition) * moneyReturn;
        }
        return result;
    }
}
