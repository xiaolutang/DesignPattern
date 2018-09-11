package com.txl.designpattern.decorative_pattern.demo;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/11 21:53
 * @Description:
 */
public class TShirts extends Finery{
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
