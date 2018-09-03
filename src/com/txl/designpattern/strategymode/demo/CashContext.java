package com.txl.designpattern.strategymode.demo;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/3 7:53
 * @Description:
 */
public class CashContext {
    public static final String STRATEGY_NORMAL = "正常收费";
    public static final String STRATEGY_RETURN = "满减";
    public static final String STRATEGY_REBATE = "打折";

    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type){
            case "STRATEGY_NORMAL":
                cashSuper = new CashNormal();
                break;
            case "STRATEGY_RETURN":
                cashSuper = new CashReturn(300,100);
                break;
            case "STRATEGY_REBATE":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
