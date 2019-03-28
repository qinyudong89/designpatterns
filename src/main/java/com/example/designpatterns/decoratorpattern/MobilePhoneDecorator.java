package com.example.designpatterns.decoratorpattern;
/**
 * @author yu dong qin
 * @ClassName:抽象装饰类
 * @Description: 用于装饰“被装饰类”
 * @date
 */
public abstract class MobilePhoneDecorator implements MobilePhoneComponent {
    private MobilePhoneComponent component;

    public MobilePhoneDecorator(MobilePhoneComponent component) {
        this.component = component;
    }

    @Override
    public void call() {
        component.call();
    }

    @Override
    public void sendMsg() {
        component.sendMsg();
    }
}
