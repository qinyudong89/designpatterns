package com.example.designpatterns.abstractfactory;

/**
 * @author yu dong qin
 * @ClassName: 奔驰商务车具体产品类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class BenzBusinessCar implements BenzCar {
    @Override
    public void gasUp() {
        System.out.println("给我加一般的汽油。。。");
    }
}
