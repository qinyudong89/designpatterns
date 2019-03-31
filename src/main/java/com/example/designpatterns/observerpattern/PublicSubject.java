package com.example.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yu dong qin
 * @ClassName: 微信“公众号”类
 * @Description: 具体被观察者(具体目标角色)
 * @date
 */
public class PublicSubject implements WeChatSubject {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void del(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notice(String msg) {
        for (Observer observer : observerList) {
            observer.update(msg);
        }
    }
}
