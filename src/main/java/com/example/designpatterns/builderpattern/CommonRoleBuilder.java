package com.example.designpatterns.builderpattern;

/**
 * @author yu dong qin
 * @ClassName: 具体建造者
 * @Description: 普通角色，封装复杂建造过程
 * @date
 */
public class CommonRoleBuilder extends Builder {
    private Role role = new Role();

    @Override
    public void buildHead() {
        role.setHead("common head");
    }

    @Override
    public void buildFace() {
        role.setFace("common face");
    }

    @Override
    public void buildBody() {
        role.setBody("common body");
    }

    @Override
    public void buildHp() {
        role.setHp(100d);
    }

    @Override
    public void buildSp() {
        role.setSp(100d);
    }

    @Override
    public void buildMp() {
        role.setMp(100d);
    }

    @Override
    public Role getResult() {
        return role;
    }
}
