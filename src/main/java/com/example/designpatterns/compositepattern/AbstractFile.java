package com.example.designpatterns.compositepattern;

/**
 * @author yu dong qin
 * @ClassName: 抽象构件
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public interface AbstractFile {
    /**
     * 新增
     * @param file
     */
    void add(AbstractFile file);

    /**
     * 删除
     * @param file
     */
    void remove(AbstractFile file);

    /**
     * 获取成员
     * @param index
     */
    AbstractFile getChild(int index);

    /**
     * 杀毒
     */
    void killVirus();
}
