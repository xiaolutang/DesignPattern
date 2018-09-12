package com.txl.designpattern.proxy;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/12 22:52
 * @Description:
 */
public class Client {
    public static void main(String[] args){
        SchoolGirl xiaoMeiNv = new SchoolGirl();
        xiaoMeiNv.setName("小花猪");
        Proxy daili = new Proxy(xiaoMeiNv);
        daili.giveDolls();
        daili.giveFlows();
        daili.giveChocolate();
    }
}
