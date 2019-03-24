package com.example.designpatterns.builderpattern;

/**
 * @author yu dong qin
 * @ClassName: 具体建造者
 * @Description: 超级角色，封装复杂建造过程
 * @date
 */
public class SuperRoleBuilder extends Builder{

    private Role role = new Role();

    @Override
    public void buildHead() {
        role.setHead("suoer head");
    }

    @Override
    public void buildFace() {
        role.setFace("super face");
    }

    @Override
    public void buildBody() {
        role.setBody("super body");
    }

    @Override
    public void buildHp() {
        role.setHp(120d);
    }

    @Override
    public void buildSp() {
        role.setSp(120d);
    }

    @Override
    public void buildMp() {
        role.setMp(120d);
    }

    @Override
    public Role getResult() {
        return role;
    }
}
