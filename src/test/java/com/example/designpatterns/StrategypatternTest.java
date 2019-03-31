package com.example.designpatterns;

import com.example.designpatterns.strategypattern.AdultStrategy;
import com.example.designpatterns.strategypattern.DiscountStrategy;
import com.example.designpatterns.strategypattern.StudentStrategy;
import com.example.designpatterns.strategypattern.TrainTicket;

/**
 * @author yu dong qin
 * @ClassName:策略模式测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class StrategypatternTest {
    public static void main(String[] args) {
        TrainTicket adultTrainTicket , studentTrainTicket;
        DiscountStrategy adultStrategy,studentStrategy;

        adultStrategy = new AdultStrategy();
        studentStrategy = new StudentStrategy();

        adultTrainTicket =  new TrainTicket(adultStrategy);
        studentTrainTicket = new TrainTicket(studentStrategy);
        adultTrainTicket.setPrice(100);
        System.out.println("成人原票价为："+ adultTrainTicket.getPrice());
        adultTrainTicket.calculate();

        System.out.println("------------黄金分割线--------------");

        studentTrainTicket.setPrice(100);
        System.out.println("学生原票价为："+ studentTrainTicket.getPrice());
        studentTrainTicket.calculate();
    }
}
