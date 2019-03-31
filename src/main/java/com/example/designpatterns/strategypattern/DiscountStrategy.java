package com.example.designpatterns.strategypattern;

/**
 * @author yu dong qin
 * @ClassName: 折扣类
 * @Description: 抽象策略类
 * @date
 */
public interface DiscountStrategy {
    void calculate(double price);
}
