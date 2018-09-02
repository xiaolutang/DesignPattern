package com.txl.designpattern.simplefactory;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/2 15:05
 * @Description:
 */
public class OperationFactory {

    public static Operation createOperation(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
            case "/":
        }
        return operation;
    }
}
