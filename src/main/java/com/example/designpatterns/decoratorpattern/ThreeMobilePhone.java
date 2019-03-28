package com.example.designpatterns.decoratorpattern;

/**
 * @author yu dong qin
 * @ClassName: 3G手机
 * @Description: 具体构件类（被装饰者）
 * @date
 */
public class ThreeMobilePhone implements MobilePhoneComponent {
    @Override
    public void call() {
        System.out.println("3G手机，打电话。。。");
    }

    @Override
    public void sendMsg() {
        System.out.println("3G手机，发短信。。。");
    }
}
