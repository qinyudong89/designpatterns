package com.example.designpatterns.abstractfactory;

/**
 * @author yu dong qin
 * @ClassName: 特斯拉具体产品类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class TeslaSportCar implements TeslaCar {
    @Override
    public void charge() {
        System.out.println("给我的特斯拉充满电。。。");
    }
}
