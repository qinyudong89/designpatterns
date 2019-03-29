package com.example.designpatterns.facadepattern;

/**
 * @author yu dong qin
 * @ClassName: CUP类
 * @Description: 子系统角色(这里用一句话描述这个类的作用)
 * @date
 */
public class CPU {

    public void begin(){
        System.out.println("CPU开启。。。");
    }

    public void shutdown(){
        System.out.println("CUP关闭。。。");
    }
}
