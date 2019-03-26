package com.example.designpatterns;

import com.example.designpatterns.compositepattern.*;

/**
 * @author yu dong qin
 * @ClassName: 组合模式测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class CompositepatternTest {
    public static void main(String[] args) {
        AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;

        folder1 = new Folder("Sunny资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");

        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("杨过.gif");
        file3 = new TextFile("神雕侠侣.txt");
        file4 = new TextFile("笑傲江湖.txt");
        file5 = new VideoFile("天龙八部.rmvb");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        //从Sunny资料结点开始，进行杀毒操作
        folder1.killVirus();
    }
}
