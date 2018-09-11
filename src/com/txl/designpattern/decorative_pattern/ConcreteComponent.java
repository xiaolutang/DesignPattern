package com.txl.designpattern.decorative_pattern;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/6 7:31
 * @Description:
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
