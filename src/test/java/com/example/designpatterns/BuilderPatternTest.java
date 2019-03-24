package com.example.designpatterns;

import com.example.designpatterns.builderpattern.*;

/**
 * @author yu dong qin
 * @ClassName: 建造者模式测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class BuilderPatternTest {

    public static void main(String[] args) {

        Director director = new Director();
        Builder commonBuilder = new CommonRoleBuilder();

        director.construct(commonBuilder);
        Role commonRole = commonBuilder.getResult();
        System.out.println("普通角色：" + commonRole);

        Builder superBuilder = new SuperRoleBuilder();
        director.construct(superBuilder);
        System.out.println("超级角色：" + superBuilder.getResult());

    }
}
