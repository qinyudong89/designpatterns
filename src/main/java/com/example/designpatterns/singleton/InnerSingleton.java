package com.example.designpatterns.singleton;

/**
 * @author yu dong qin
 * @ClassName:静态内部类实现单例
 * @Description:优点：线程安全（静态内部类只初始化一次）、不占内存
 * 缺点：无法传参数
 * 静态内部类为什么是线程安全的？
 * 原因：虚拟机会保证一个类的类构造器<clinit>()在多线程环境中被正确的加锁、同步，如果多个线程同时去初始化一个类，
 * 那么只会有一个线程去执行这个类的类构造器<clinit>()，其他线程都需要阻塞等待，直到活动线程执行<clinit>()方法完毕。
 *
 * 特别需要注意的是，在这种情形下，其他线程虽然会被阻塞，但如果执行<clinit>()方法的那条线程退出后，
 * 其他线程在唤醒之后不会再次进入/执行<clinit>()方法，因为 在同一个类加载器下，一个类型只会被初始化一次。
 * 如果在一个类的<clinit>()方法中有耗时很长的操作，就可能造成多个线程阻塞，在实际应用中这种阻塞往往是隐藏的

 *  @date
 */
public class InnerSingleton {

    public static InnerSingleton getInstance(){
        return Singleton.instance;
    }
    private static class Singleton{
        private static InnerSingleton instance = new InnerSingleton();
    }
    //禁止外部创建实例
    private InnerSingleton(){}
}
