package com.example.designpatterns.simplefactory;

/**
 * @author yu dong qin
 * @ClassName:
 * @Description:
 * 特点：
 * 1、一个抽象类或接口，封装公有方法；若干个子类，负责具体业务；一个工厂类负责创建对象。
 * 2、创建与使用分离
 * 3、使用时只需要传入需要的参数即可
 *
 * 缺点：
 * 1、无法扩展功能（扩展时破坏，开闭原则）
 * @date
 */
public class SimpleFactory {

    /**
     * 生产果汁
     * @param code
     */
    public static void create(String code) {
        if (FruitEnum.APPLE.getCode().equals(code)) {
           Juicer juicer =  new Apple();
           juicer.juicering();
        } else if (FruitEnum.GRAPES.getCode().equals(code)) {
            Juicer juicer = new Grapes();
            juicer.juicering();
        }
    }
}
