package com.example.designpatterns;

import com.example.designpatterns.bridgepattern.*;

/**
 * @author yu dong qin
 * @ClassName: 桥接模式测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class BridgepatternTest {
    public static void main(String[] args) {
        Implementor a,b;
        Abstraction abstraction = new RefinedAbstraction();
        a = new ConcreateImplementorA();
        abstraction.setImplementor(a);
        abstraction.operation();

        b = new ConcreateImplementorB();
        abstraction.setImplementor(b);
        abstraction.operation();
    }
}
