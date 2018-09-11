package com.txl.designpattern.decorative_pattern;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/6 7:38
 * @Description:
 */
public class Client {
    public static void main(String[] args){
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(concreteComponent);
        d2.setComponent(d1);
        d2.operation();
    }
}
