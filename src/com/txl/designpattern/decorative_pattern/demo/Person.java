package com.txl.designpattern.decorative_pattern.demo;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/6 7:45
 * @Description:
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name);
    }
}
