package com.example.designpatterns.abstractfactory;

/**
 * @author yu dong qin
 * @ClassName: 跑车具体工厂类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class SportCarFactory implements CarFactory{

    @Override
    public BenzCar getBenzCar() {
        return new BenzSportCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaSportCar();
    }
}
