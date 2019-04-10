package com.example.designpatterns.templatemethodpattern;

/**
 * @author yu dong qin
 * @ClassName: 查询类
 * @Description: 具体子类
 * @date
 */
public class QueryConcrete extends AbstractJdbcTemplate {
    private boolean flag = false;

    @Override
    protected void operation() {
        System.out.println("执行查询语句。。。");
    }

    /**
     * 对不同行为进行控制
     * @return
     */
    @Override
    protected boolean isHook() {
        return flag;
    }

    @Override
    protected void hook() {
        System.out.println("打印查询结果。。。");
    }

    public QueryConcrete() {
    }

    public QueryConcrete(boolean flag) {
        this.flag = flag;
    }

}
