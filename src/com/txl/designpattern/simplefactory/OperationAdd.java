package com.txl.designpattern.simplefactory;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/2 15:08
 * @Description:
 */
public class OperationAdd extends Operation {



    @Override
    double getResult() {
        return numberA + numberB;
    }
}
