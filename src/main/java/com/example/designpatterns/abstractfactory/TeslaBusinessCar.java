package com.example.designpatterns.abstractfactory;

/**
 * @author yu dong qin
 * @ClassName: 特斯拉商务车具体产品类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class TeslaBusinessCar implements TeslaCar {
    @Override
    public void charge() {
        System.out.println("给我的特斯拉商务车充一半的电。。。");
    }
}
