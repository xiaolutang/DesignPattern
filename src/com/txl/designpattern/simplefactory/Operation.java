package com.txl.designpattern.simplefactory;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/2 15:03
 * @Description:
 */
public abstract class Operation {
    protected double numberA = 0;
    protected double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    abstract double getResult();
}
