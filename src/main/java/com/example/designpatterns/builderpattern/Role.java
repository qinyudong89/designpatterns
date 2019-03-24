package com.example.designpatterns.builderpattern;

/**
 * @author yu dong qin
 * @ClassName: 角色类
 * @Description: 封装人、仙、魔角色共同拥有的特征(这里用一句话描述这个类的作用)
 * @date
 */
public class Role {
    /**
     *  头部
     */
    private String head;
    /**
     * 脸部（脸部依赖于头部）
     **/
    private String face;
    /**
     * 身体
     */
    private String body;
    /**
     * 生命值
     */
    private Double hp;
    /**
     * 能量值
     */
    private Double sp;
    /**
     * 魔法值
     */
    private Double mp;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public Double getSp() {
        return sp;
    }

    public void setSp(Double sp) {
        this.sp = sp;
    }

    public Double getMp() {
        return mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "Role{" +
                "head='" + head + '\'' +
                ", face='" + face + '\'' +
                ", body='" + body + '\'' +
                ", hp=" + hp +
                ", sp=" + sp +
                ", mp=" + mp +
                '}';
    }
}
