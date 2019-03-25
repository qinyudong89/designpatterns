package com.example.designpatterns.adapterpattern;

/**
 * @author yu dong qin
 * @ClassName: 苹果设备充电器
 * @Description:
 * @date
 */
public class AppleCharger implements Lightning {
    @Override
    public void chargeWithLightning() {
        System.out.println("使用Lightning充电器充电中。。。");
    }
}
