package com.example.designpatterns.observerpattern;

/**
 * @author yu dong qin
 * @ClassName: 具体观察者类
 * @Description: 具体观察者角色(这里用一句话描述这个类的作用)
 * @date
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(String msg) {
        System.out.println(msg);
    }
}
