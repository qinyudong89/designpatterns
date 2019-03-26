package com.example.designpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yu dong qin
 * @ClassName: 文件夹类
 * @Description: 容器构件角色(这里用一句话描述这个类的作用)
 * @date
 */
public class Folder implements AbstractFile {
    //定义集合用于存储AbstractFiel成员
    private List<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name){
        this.name = name;
    }
    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int index) {
        return fileList.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("------对文件夹[ " + name + " ]进行杀毒。。。" );
        //递归调用成员构件的killVirus（）方法
        for (AbstractFile file:fileList) {
            file.killVirus();
        }
    }
}
