package com.example.designpatterns.adapterpattern;

/**
 * @author yu dong qin
 * @ClassName: 适配器
 * @Description: 将MicroUsb接口转成Llghtning接口
 * 该适配器的功能是把一个MicroUsb转换成Llghtning。实现方式是实现目标类的接口
 * （Llghtning），然后使用组合的方式，在该适配器中定义microUsb。
 * 然后在重写的chargeWithLlghtning（）方法中，采用microUsb的方法来实现具体细节。
 * @date
 */
public class Adapter implements Lightning{
    private MicroUsb microUsb;

    public Adapter() {
    }

    public Adapter(MicroUsb microUsb) {
        this.microUsb = microUsb;
    }

    public MicroUsb getMicroUsb() {
        return microUsb;
    }

    public void setMicroUsb(MicroUsb microUsb) {
        this.microUsb = microUsb;
    }

    @Override
    public void chargeWithLightning() {
        //重写，以达到适配的目的
        microUsb.chargeWithMicroUsb();
    }
}
