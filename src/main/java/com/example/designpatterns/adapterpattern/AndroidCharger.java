package com.example.designpatterns.adapterpattern;

/**
 * @author yu dong qin
 * @ClassName: 安卓设备的充电器
 * @Description:
 * @date
 */
public class AndroidCharger implements MicroUsb {
    @Override
    public void chargeWithMicroUsb() {
        System.out.println("使用MicroUsb充电器充电中。。。");
    }
}
