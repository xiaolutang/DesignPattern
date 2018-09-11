package com.txl.designpattern.decorative_pattern.demo;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/6 7:48
 * @Description: 装饰类
 */
public class Finery extends Person {
    private Person component;

    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if(component != null){
            component.show();
        }
    }
}
