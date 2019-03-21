package com.example.designpatterns.singleton;

/**
 * @author yu dong qin
 * @ClassName:内部类实现单例
 * @Description:优点：线程安全（静态内部类只初始化一次）、不占内存
 * 缺点：无法传参数
 *  @date
 */
public class InnerMode {

    public static InnerMode getInstance(){
        return Singleton.instance;
    }
    private static class Singleton{
        private static InnerMode instance = new InnerMode();
    }
    //禁止外部创建实例
    private InnerMode(){}
}
