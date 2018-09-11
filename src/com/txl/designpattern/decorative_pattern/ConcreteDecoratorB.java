package com.txl.designpattern.decorative_pattern;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/6 7:36
 * @Description:
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior() {
    }
}
