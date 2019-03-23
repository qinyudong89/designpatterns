package com.example.designpatterns.simplefactory;

/**
 * @author yu dong qin
 * @ClassName:
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public enum FruitEnum {
    APPLE("1", "苹果"), GRAPES("2", "葡萄");

    private String code;
    private String name;

    FruitEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
