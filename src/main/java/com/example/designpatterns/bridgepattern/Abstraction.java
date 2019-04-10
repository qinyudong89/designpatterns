package com.example.designpatterns.bridgepattern;

/**
 * @author yu dong qin
 * @ClassName: 抽象桥接类
 * @Description: 桥接模式（Bridge)是一种结构型设计模式。Bridge模式基于类的最小设计原则，
 * 通过使用封装、聚合及继承等行为让不同的类承担不同的职责。它的主要特点是把抽象(Abstraction)
 * 与行为实现(Implementation)分离开来，从而可以保持各部分的独立性以及应对他们的功能扩展
 * @date
 */
public abstract class Abstraction {
    private Implementor implementor;

    public void operation() {
        implementor.operation();
    }

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

}
