package com.example.designpatterns;

import com.example.designpatterns.singleton.Enums;

/**
 * @author yu dong qin
 * @ClassName: 单例测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Enums.INSTANCE.hashCode() + " 线程ID：" + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        MyThread myThread;
        for (int i = 0; i < 50; i++) {
            myThread = new MyThread();
            myThread.start();
        }
    }
}
