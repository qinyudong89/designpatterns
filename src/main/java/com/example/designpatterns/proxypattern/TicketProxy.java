package com.example.designpatterns.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yu dong qin
 * @ClassName: 代理角色
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class TicketProxy implements InvocationHandler {
    private APP12306 app12306;

    public TicketProxy(APP12306 app12306) {
        this.app12306 = app12306;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(app12306, args);
    }
}
