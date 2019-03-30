package com.example.designpatterns.proxypattern;

/**
 * 抽象角色
 */
public interface APP12306 {

    /**
     * 身份证验证
     */
    void authentication();

    /**
     * 购票
     */
    void buyTicket();

    /**
     * 打印车票
     */
    void printTicket();
}
