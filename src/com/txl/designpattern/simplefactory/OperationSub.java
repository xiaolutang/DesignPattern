package com.txl.designpattern.simplefactory;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/2 15:11
 * @Description: 减法
 */
public class OperationSub extends Operation {

    @Override
    double getResult() {
        return numberA - numberB;
    }
}
