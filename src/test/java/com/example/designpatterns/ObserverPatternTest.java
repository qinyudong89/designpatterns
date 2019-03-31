package com.example.designpatterns;

import com.example.designpatterns.observerpattern.ConcreteObserver;
import com.example.designpatterns.observerpattern.Observer;
import com.example.designpatterns.observerpattern.PublicSubject;
import com.example.designpatterns.observerpattern.WeChatSubject;

/**
 * @author yu dong qin
 * @ClassName: 观察者模式测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        Observer o1, o2;
        WeChatSubject wc1, wc2;
        o1 = new ConcreteObserver();
        o2 = new ConcreteObserver();

        wc1 = new PublicSubject();
        wc1.add(o1);
        wc1.notice("张一取消关注。。。");

        wc2 = new PublicSubject();
        wc2.add(o2);
        wc2.notice("李四添加关注。。。");


    }
}
