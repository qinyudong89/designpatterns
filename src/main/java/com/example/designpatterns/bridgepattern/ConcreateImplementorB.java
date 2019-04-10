package com.example.designpatterns.bridgepattern;

/**
 * @author yu dong qin
 * @ClassName: 具体实现角色B
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class ConcreateImplementorB implements Implementor {
    @Override
    public void operation() {
        System.out.println("这是实现类ConcreateImplementorB。。。");
    }
}
