package com.example.designpatterns;

import com.example.designpatterns.proxypattern.APP12306;
import com.example.designpatterns.proxypattern.TicketAgency;
import com.example.designpatterns.proxypattern.TicketProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author yu dong qin
 * @ClassName: 动态代理模式，测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class ProxypatternTest {
    public static void main(String[] args) {
        //真实角色
        APP12306 app12306 = new TicketAgency();
        //代理角色
        InvocationHandler invocationHandler = new TicketProxy(app12306);
        //
        APP12306 app = (APP12306) Proxy.newProxyInstance(APP12306.class.getClassLoader(),new Class[]{APP12306.class},invocationHandler);
        app.authentication();
        app.buyTicket();
        app.printTicket();
    }
}
