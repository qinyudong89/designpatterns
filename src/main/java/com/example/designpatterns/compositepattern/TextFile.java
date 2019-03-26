package com.example.designpatterns.compositepattern;

/**
 * @author yu dong qin
 * @ClassName: 文本文件类
 * @Description: 叶子构件包角色(这里用一句话描述这个类的作用)
 * @date
 */
public class TextFile implements AbstractFile {
    private String name;

    public TextFile(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法");
    }

    @Override
    public AbstractFile getChild(int index) {
        System.out.println("对不起，不支持该方法");
        return null;
    }

    @Override
    public void killVirus() {
        //模拟杀毒
        System.out.println("------对文本文件[ " + name + " ]进行杀毒。。。" );
    }
}
