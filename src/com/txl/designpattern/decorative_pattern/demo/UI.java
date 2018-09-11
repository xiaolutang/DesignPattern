package com.txl.designpattern.decorative_pattern.demo;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/11 21:56
 * @Description:
 */
public class UI {
    public static void main(String[] args){
        Person xc = new Person("小明");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.decorate(xc);
        bigTrouser.decorate(tShirts);

        bigTrouser.show();
    }
}
