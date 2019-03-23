package com.example.designpatterns.factorymethod;

/**
 * @author yu dong qin
 * @ClassName:具体工厂角色
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class BlackTeaFactory implements TeaFactory {
    @Override
    public Tea create() {
        return new BlackTea();
    }
}
