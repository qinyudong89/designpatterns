package com.example.designpatterns.strategypattern;

/**
 * @author yu dong qin
 * @ClassName: 抽象策略类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class AdultStrategy implements DiscountStrategy{
    //成人火车票，全票不打折
    private final static Double DISCOUNT = 1.0;
    @Override
    public void calculate(double price) {
        System.out.println("成人票价为：" + (DISCOUNT*price));
    }
}
