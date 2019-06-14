package com.example.designpatterns.observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description:观察者
 * @Auther: 覃钰栋
 * @Date: 2019/6/14 10:53
 */
public class SimpleObserver implements Observer {

    public SimpleObserver(SimpleObservable observable) {
       observable.addObserver(this);
    }

    //arg,为任意对象，用于传递参数
    @Override
    public void update(Observable o, Object arg) {
        SimpleObservable observable = (SimpleObservable) o;
        int data = ((SimpleObservable) o).getData();
        System.out.println("数据改变了" + arg);
    }


}
