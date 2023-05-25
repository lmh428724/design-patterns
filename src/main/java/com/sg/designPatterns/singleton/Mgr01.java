package com.sg.designPatterns.singleton;/**
 * @auther silly goose
 * @date 2023/5/25
 * @apiNote
 */

/**
 * 饿汉式
 * 类加载到内存后, 就实例化一个单例, JVM保证线程安全
 * 简单实用, 推荐使用!
 * 唯一缺点: 不管用到与否, 类装载时就完成实例化
 * (过多的话可能会导致程序启动时间变长)
 *
 * @Author silly goose
 * @Description //TODO $
 * @Date $ $
 **/
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {
    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 instance1 = Mgr01.getInstance();
        Mgr01 instance2 = Mgr01.getInstance();
        System.out.println(instance1 == instance2);
    }
}
