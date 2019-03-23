package com.example.designpatterns.abstractfactory;

/**
 * @author yu dong qin
 * @ClassName: 奔驰跑车具体产品类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class BenzSportCar implements BenzCar {
    @Override
    public void gasUp() {
        System.out.println("给我的奔驰加最好的汽油。。。");
    }
}
