package com.txl.designpattern.decorative_pattern;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/6 7:34
 * @Description:
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedStated;

    @Override
    public void operation() {
        super.operation();
        addedStated = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
