package com.example.designpatterns.singleton;

/**
 * @author yu dong qin
 * @ClassName:饿汉式单例
 * @Description:
 * 1、优点：实例在需要时才创建，节省内存
 * 2、缺点：如不经处理，会导致线程不安全、性能低
 * 3、volatile的作用：多线程下保证变量的可见性、禁止语义重排序
 * 4：禁止语言重排序的作用：在某个线程创建单例对象时，在构造函数被调用前，
 * 就为该对象分配了内存空间并将对象的字段设置为默认值。此时就可以将分配的内存地址赋值
 * 给instance字段了，然而该对象可能还没初始化。若紧接着另一个线程来调用getInstance，
 * 获取到的就是状态不正确的对象，程序出错。
 *      而volatile的一个语义是禁止指令重排序优化，也就保证了instance变量被赋值的时候
 * 对象已经是初始化过的，从而避免了上述问题。
 * 5、双重检查避免，实例不唯一
 * @date
 */
public class LazyMode {
    private volatile static  LazyMode INSTANCE ;
    public static LazyMode getInstance(){
        if (INSTANCE == null){
            synchronized(LazyMode.class){
                if (INSTANCE == null){
                    INSTANCE = new LazyMode();
                }
            }
        }
        return INSTANCE;
    }

    //禁止外部创建实例
    private LazyMode(){}

}
