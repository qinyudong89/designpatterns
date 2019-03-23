package com.example.designpatterns.abstractfactory;

/**
 * @author yu dong qin
 * @ClassName: 汽车工厂抽象类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public interface CarFactory {
    /**
     * 生产奔驰系列汽车
     * @return
     */
    BenzCar getBenzCar();

    /**
     * 生产特斯拉电动汽车
     * @return
     */
    TeslaCar getTeslaCar();

}
