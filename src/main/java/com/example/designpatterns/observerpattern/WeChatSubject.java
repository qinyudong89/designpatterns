package com.example.designpatterns.observerpattern;

/**
 * 微信类
 * 抽象被观察者（目标角色，消息的发送者）
 */
public interface WeChatSubject {

    /**
     * 添加观察者
     *
     * @param observer
     */
    void add(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    void del(Observer observer);

    /**
     * 通知方法
     */
    void notice(String msg);
}
