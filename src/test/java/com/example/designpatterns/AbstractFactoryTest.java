package com.example.designpatterns;

import com.example.designpatterns.abstractfactory.BusinessCarFactory;
import com.example.designpatterns.abstractfactory.CarFactory;
import com.example.designpatterns.abstractfactory.SportCarFactory;

/**
 * @author yu dong qin
 * @ClassName: 抽象工厂模式测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CarFactory sportCarFactory = new SportCarFactory();
        sportCarFactory.getBenzCar().gasUp();
        sportCarFactory.getTeslaCar().charge();

        CarFactory businessCarFactory = new BusinessCarFactory();
        businessCarFactory.getBenzCar().gasUp();
        businessCarFactory.getTeslaCar().charge();
    }
}
