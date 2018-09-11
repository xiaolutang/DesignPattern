package com.txl.designpattern.decorative_pattern.demo;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/11 21:55
 * @Description:
 */
public class BigTrouser extends Finery{
    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
