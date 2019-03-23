package com.example.designpatterns.singleton;

/**
 * @author yu dong qin
 * @ClassName:枚举实现单例（最简洁的方式）
 * @Description: 线程安全代码还简洁、无偿地提供了序列化机制、在面对复杂的序列化或者反射攻击时仍然可以绝对防止多次实例化等优点，
 * 单元素的枚举类型被认为是实现Singleton的最佳方法。
 * 枚举线程安全是因为，当一个Java类第一次被真正使用到的时候静态资源被初始化、Java类的加载和初始化过程都是线程安全的
 * （因为虚拟机在加载枚举的类的时候，会使用ClassLoader的loadClass方法，
 * 而这个方法使用同步代码块保证了线程安全）。所以，创建一个enum类型是线程安全的
 * @date
 */
public enum EnumSingleton {

    INSTANCE;
    private EnumSingleton(){}
}
