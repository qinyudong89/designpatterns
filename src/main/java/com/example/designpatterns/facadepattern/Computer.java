package com.example.designpatterns.facadepattern;

/**
 * @author yu dong qin
 * @ClassName: 计算机
 * @Description: 外观角色(外观模式的核心)
 * @date
 */
public class Computer {
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        this.cpu = new CPU();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void begin(){
        System.out.println("Computer开启。。。");
        //调用子系统
        cpu.begin();
        memory.begin();
        disk.begin();
    }

    public void shutdown(){
        //调用子系统
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("Computer关闭。。。");
    }

}
