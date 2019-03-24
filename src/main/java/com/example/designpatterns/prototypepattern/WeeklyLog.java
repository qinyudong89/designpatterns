package com.example.designpatterns.prototypepattern;

import java.io.*;
import java.util.List;

/**
 * @author yu dong qin
 * @ClassName: 周报
 * @Description: 通过序列化及流的方式，实现深克隆
 * 深克隆：1、无论原型对象的成员变量是“值类型”，还是“引用类型”。都将复制一份给克隆对象。
 * 2、除了对象本身被复制外，对象所包含的所有成员变量也将被复制。
 * @date
 */
public class WeeklyLog implements Serializable {
    private String date;
    private String content;
    private List<Attachment> attachmentList;

    /**
     * 使用序列化的方式，实现深克隆
     *
     * @return
     */
    @Override
    public WeeklyLog clone() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        WeeklyLog weeklyLog = null;
        try {
            oos = new ObjectOutputStream(baos);
            //将对象写入流中
            oos.writeObject(this);
            //从流中取出对象
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = null;
            ois = new ObjectInputStream(bais);
            weeklyLog = (WeeklyLog) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return weeklyLog;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Attachment> getAttachmentList() {
        return attachmentList;
    }

    public void setAttachmentList(List<Attachment> attachmentList) {
        this.attachmentList = attachmentList;
    }
}
