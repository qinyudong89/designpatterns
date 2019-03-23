package com.example.designpatterns;

import com.example.designpatterns.factorymethod.BlackTeaFactory;
import com.example.designpatterns.factorymethod.GreenTeaFactory;
import com.example.designpatterns.factorymethod.MethodFactory;
import com.example.designpatterns.factorymethod.TeaFactory;

/**
 * @author yu dong qin
 * @ClassName:
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class MethodFactoryTest {
    public static void main(String[] args) {
      TeaFactory teaFactory = new BlackTeaFactory();
      teaFactory.create();
      TeaFactory teaFactory1 = new GreenTeaFactory();
      teaFactory1.create();
    }
}
