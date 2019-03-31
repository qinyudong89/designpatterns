package com.example.designpatterns.observerpattern;

/**
 * @author yu dong qin
 * @ClassName: 抽象观察者
 * @Description: 观察者角色（消息的接收者）
 * @date
 */
public interface Observer {

    void update(String msg);
}
