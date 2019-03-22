package com.example.designpatterns.singleton;

/**
 * @author yu dong qin
 * @ClassName:枚举实现单例（最简洁的方式）
 * @Description: 其功能完整、使用简洁、无偿地提供了序列化机制、在面对复杂的序列化或者反射攻击时仍然可以绝对防止多次实例化等优点，
 * 单元素的枚举类型被认为是实现Singleton的最佳方法。
 * @date
 */
public enum EnumSingleton {

    INSTANCE;
    private EnumSingleton(){}
}
