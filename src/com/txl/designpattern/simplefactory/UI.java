package com.txl.designpattern.simplefactory;


import java.util.Scanner;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/2 15:15
 * @Description:
 */
public class UI {
    public static void main(String args[]){
        double numA, numB;
        String operation;
        System.out.println("输入数字A: ");
        Scanner in =new Scanner(System.in);
        numA = in.nextDouble();
        System.out.println("请选择运算符号: + - * / ");
        operation = in.next();
        System.out.println("输入数字B: ");
        numB = in.nextDouble();
        in.close();

        Operation operate = OperationFactory.createOperation(operation);
        operate.setNumberA(numA);
        operate.setNumberB(numB);
        System.out.println("结果是： "+operate.getResult());
    }
}
