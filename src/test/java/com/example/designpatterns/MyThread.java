package com.example.designpatterns;

import com.example.designpatterns.singleton.EnumSingleton;

/**
 * @author yu dong qin
 * @ClassName: 测试单例在多线程环境下，是否线程安全
 * @Description: 测试类
 * @date
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(EnumSingleton.INSTANCE.hashCode() + " 线程ID：" + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        MyThread myThread;
        for (int i = 0; i < 50; i++) {
            myThread = new MyThread();
            myThread.start();
        }
    }
}
