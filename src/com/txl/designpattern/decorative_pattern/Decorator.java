package com.txl.designpattern.decorative_pattern;

/**
 * @Author: 唐小陆
 * @Date: 2018/9/6 7:32
 * @Description:
 */
public class Decorator extends Component {
    protected Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
