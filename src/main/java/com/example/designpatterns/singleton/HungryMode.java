package com.example.designpatterns.singleton;

/**
 * @author yu dong qin
 * @ClassName: 饿汉式单例
 * @Description:
 * 1、优点：简单、线程安全
 * 2、缺点，在没有实例没有用到时候，也会先创建
 * @date
 */
public class HungryMode {
    private static HungryMode instance ;

    public static HungryMode getInstance(){
        if (instance == null){
            instance = new HungryMode();
        }
        return instance;
    }
    //禁止外部创建实例
    private HungryMode(){}
}
