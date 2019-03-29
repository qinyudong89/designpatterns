package com.example.designpatterns.facadepattern;

/**
 * @author yu dong qin
 * @ClassName: 内存类
 * @Description: 子系统角色(这里用一句话描述这个类的作用)
 * @date
 */
public class Memory {

    public void begin(){
        System.out.println("Memory开启。。。");
    }

    public void shutdown(){
        System.out.println("Memory关闭。。。");
    }
}
