package com.example.designpatterns;

import com.example.designpatterns.adapterpattern.Adapter;
import com.example.designpatterns.adapterpattern.AndroidCharger;
import com.example.designpatterns.adapterpattern.AppleCharger;
import com.example.designpatterns.adapterpattern.Iphone6Plus;

/**
 * @author yu dong qin
 * @ClassName: 适配器模式测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class AdapterpatternTest {
    public static void main(String[] args) {
        Iphone6Plus iphone6Plus = new Iphone6Plus(new AppleCharger());
        iphone6Plus.charge();

        System.out.println("------------黄金分割线------------");

        Adapter adapter  = new Adapter(new AndroidCharger());
        Iphone6Plus newIphone = new Iphone6Plus();
        newIphone.setLightning(adapter);
        newIphone.charge();
    }
}
