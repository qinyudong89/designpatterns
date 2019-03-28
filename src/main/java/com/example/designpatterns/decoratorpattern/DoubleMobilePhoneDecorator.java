package com.example.designpatterns.decoratorpattern;

/**
 * @author yu dong qin
 * @ClassName: 2G手机装饰类
 * @Description: 具体装饰类
 * @date
 */
public class DoubleMobilePhoneDecorator extends MobilePhoneDecorator {
    public DoubleMobilePhoneDecorator(MobilePhoneComponent component) {
        super(component);
    }

    @Override
    public void call() {
        super.call();
        this.surfInternet();
    }

    @Override
    public void sendMsg() {
        super.sendMsg();
        this.surfInternet();
    }

    public void surfInternet(){
        System.out.println("为手机实现上网。。。");
    }
}
