package com.example.designpatterns.strategypattern;

/**
 * @author yu dong qin
 * @ClassName: 学生策略类
 * @Description: 具体策略类(这里用一句话描述这个类的作用)
 * @date
 */
public class StudentStrategy implements DiscountStrategy {
    //学生火车票，全票不打折
    private final static Double DISCOUNT = 0.5;
    @Override
    public void calculate(double price) {
        System.out.println("学生票折后价为：" + (DISCOUNT*price));
    }
}
