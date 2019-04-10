package com.example.designpatterns.bridgepattern;

/**
 * @author yu dong qin
 * @ClassName: 具体实现角色A
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class ConcreateImplementorA implements Implementor {
    @Override
    public void operation() {
        System.out.println("这是实现类ConcreateImplementorA。。。");
    }
}
