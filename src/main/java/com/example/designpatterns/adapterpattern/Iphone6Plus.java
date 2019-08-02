package com.example.designpatterns.adapterpattern;

/**
 * @author yu dong qin
 * @ClassName: 苹果手机
 * @Description: 这里定义手机的作用是为了更方便的理解适配器模式，在该模式中他不扮演任何角色。
 * @date
 */
public class Iphone6Plus {
    private Lightning lightning;

    public Iphone6Plus() {
    }

    public Iphone6Plus(Lightning lightning) {
        this.lightning = lightning;
    }

    public void charge() {
        System.out.println("开始给Iphone6Plus手机充电...");
        lightning.chargeWithLightning();
        System.out.println("停止给Iphone6Plus手机充电...");
    }

    public Lightning getLightning() {
        return lightning;
    }

    public void setLightning(Lightning lightning) {
        this.lightning = lightning;
    }

}
