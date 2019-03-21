package com.example.designpatterns.singleton;

/**
 * @author yu dong qin
 * @ClassName:枚举实现单例
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class EnumMode {

    public static EnumMode getInstance() {
        return Enums.INSTANCE.getInstance();
    }

    private enum Enums {
        INSTANCE;
        private EnumMode enumMode;

        private Enums() {
            enumMode = new EnumMode();
        }

        private EnumMode getInstance() {
            return enumMode;
        }
    }
}
