package com.example.designpatterns.facadepattern;

/**
 * @author yu dong qin
 * @ClassName: 磁盘
 * @Description: 子系统角色(这里用一句话描述这个类的作用)
 * @date
 */
public class Disk {

    public void begin(){
        System.out.println("Disk开启。。。");
    }

    public void shutdown(){
        System.out.println("Disk关闭。。。");
    }
}
