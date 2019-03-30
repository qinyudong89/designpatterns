package com.example.designpatterns.proxypattern;

/**
 * @author yu dong qin
 * @ClassName: 火车站售票处
 * @Description: 真实角色(这里用一句话描述这个类的作用)
 * @date
 */
public class TicketAgency implements APP12306 {


    @Override
    public void authentication() {
        System.out.println("身份证验证。。。");
    }

    @Override
    public void buyTicket() {
        System.out.println("乘客购买火车票。。。");
    }

    @Override
    public void printTicket() {
        System.out.println("打印车票");
    }
}
