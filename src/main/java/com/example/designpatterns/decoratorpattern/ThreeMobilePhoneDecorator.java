package com.example.designpatterns.decoratorpattern;

/**
 * @author yu dong qin
 * @ClassName: 3G手机装饰类
 * @Description: 具体装饰类
 * @date
 */
public class ThreeMobilePhoneDecorator extends MobilePhoneDecorator {
    public ThreeMobilePhoneDecorator(MobilePhoneComponent component) {
        super(component);
    }

    @Override
    public void call() {
        super.call();
        this.seeVideo();
    }

    @Override
    public void sendMsg() {
        super.sendMsg();
        this.seeVideo();
    }

    public void seeVideo(){
        System.out.println("为手机实现看视频。。。");
    }
}
