package com.example.designpatterns;

import com.example.designpatterns.decoratorpattern.*;

/**
 * @author yu dong qin
 * @ClassName: 装饰者模式测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class DecoratorpatternTest {
    public static void main(String[] args) {
        MobilePhoneComponent component1,component2;

        //被装饰
        component1 = new DoubleMobilePhone();
        //装饰
        component2 = new DoubleMobilePhoneDecorator(component1);
        component2.sendMsg();

        System.out.println("-------------------黄金分割线------------------");

        //被装饰
        component1 = new ThreeMobilePhone();
        //装饰
        component2 = new ThreeMobilePhoneDecorator(component1);
        component2.sendMsg();
    }
}
