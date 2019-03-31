package com.example.designpatterns.strategypattern;

/**
 * @author yu dong qin
 * @ClassName: 环境类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class TrainTicket {
    //策略
    private DiscountStrategy discountStrategy;
    //票价
    private double price;

    public TrainTicket(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void calculate(){
        discountStrategy.calculate(this.price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
