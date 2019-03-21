package com.example.designpatterns.singleton;

/**
 * @author yu dong qin
 * @ClassName:枚举实现单例（最简洁的方式）
 * @Description: 线程安全、实现简单。线程安全是由于枚举实例的创建默认就是线程安全的
 * @date
 */
public enum  Enums {
    INSTANCE;
}
