package com.example.designpatterns.prototypepattern;

import java.io.Serializable;

/**
 * @author yu dong qin
 * @ClassName: 附件类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class Attachment implements Serializable {
    private String name;

    public void download(){
        System.out.println("下载附件的文件名为：" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
