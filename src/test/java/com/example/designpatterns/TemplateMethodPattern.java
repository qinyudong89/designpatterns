package com.example.designpatterns;

import com.example.designpatterns.templatemethodpattern.QueryConcrete;

/**
 * @author yu dong qin
 * @ClassName: 模板方法模式测试类
 * @Description: (这里用一句话描述这个类的作用)
 * @date
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        QueryConcrete queryConcrete = new QueryConcrete(true);
        queryConcrete.templateMethod();
    }
}
