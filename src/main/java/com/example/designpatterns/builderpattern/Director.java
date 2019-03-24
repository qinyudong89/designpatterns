package com.example.designpatterns.builderpattern;

/**
 * @author yu dong qin
 * @ClassName: 指挥者
 * @Description: 负责调用建造者(这里用一句话描述这个类的作用)
 * @date
 */
public class Director {

    public void construct(Builder builder){
        builder.buildBody();
        builder.buildHead();
        builder.buildFace();
        builder.buildHp();
        builder.buildMp();
        builder.buildSp();
    }
}
