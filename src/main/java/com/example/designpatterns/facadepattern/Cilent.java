package com.example.designpatterns.facadepattern;

/**
 * @author yu dong qin
 * @ClassName: 客户端类
 * @Description: 客户端角色(这里用一句话描述这个类的作用)
 * @date
 */
public class Cilent {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.begin();
        computer.shutdown();
    }
}
