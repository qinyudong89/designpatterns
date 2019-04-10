package com.example.designpatterns.templatemethodpattern;

/**
 * @author yu dong qin
 * @ClassName: JDBC抽象类
 * @Description: 模拟JDBC的使用
 * @date
 */
public abstract class AbstractJdbcTemplate {

    /**
     * 模板方法，定义算法骨架
     */
    public void templateMethod() {
        loadDriver();
        connection();
        operation();
        if (isHook()){
            hook();
        }
        destroy();
    }

    /**
     * 1、加载数据库驱动
     */
    private void loadDriver() {
        System.out.println("加载数据库驱动。。。");
    }

    /**
     * 2、建立数据库连接
     */
    private void connection() {
        System.out.println("建立数据库连接。。。");
    }

    /**
     * 3、执行sql语句
     */
    protected abstract void operation();

    /**
     * 4、关闭资源
     */
    private void destroy() {
        System.out.println("关闭资源。。。");
    }

    /**
     * 钩子方法(子类可以控制父类的某些行为)
     */
    protected boolean isHook() {
        return false;
    }

    /**
     * 空实现，给子类留有可扩展的余地
     */
    protected void hook() {
    }
}
