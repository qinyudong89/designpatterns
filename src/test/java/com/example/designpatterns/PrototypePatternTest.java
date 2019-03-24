package com.example.designpatterns;

import com.example.designpatterns.prototypepattern.Attachment;
import com.example.designpatterns.prototypepattern.WeeklyLog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yu dong qin
 * @ClassName: 原型模式测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class PrototypePatternTest {
    public static void main(String[] args) {
        WeeklyLog weeklyLog1, weeklyLog2;
        weeklyLog1 = new WeeklyLog();
        Attachment attachment = new Attachment();
        List<Attachment> attachmentList = new ArrayList<>();
        attachmentList.add(attachment);
        weeklyLog1.setAttachmentList(attachmentList);
        weeklyLog2 = weeklyLog1.clone();
        //对象不相同，则说明复制成功（原因：克隆出来的是一个新的对象）
        System.out.println("周报是否相同：" + (weeklyLog1 == weeklyLog2));
        System.out.println("附件是不相同："  + (weeklyLog1.getAttachmentList() == weeklyLog2.getAttachmentList()));

    }
}
