package com.example.designpatterns;

import com.example.designpatterns.observerpattern.SimpleObservable;
import com.example.designpatterns.observerpattern.SimpleObserver;

/**
 * @Description:
 * @Auther: 覃钰栋
 * @Date: 2019/6/14 11:07
 */
public class ObservableTest {
    public static void main(String[] args){
        SimpleObservable doc = new SimpleObservable ();
        SimpleObserver view = new SimpleObserver (doc);
        doc.setData(1);
        doc.setData(2);
        doc.setData(2);
        doc.setData(3);
    }
}
