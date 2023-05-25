package com.sg.designPatterns.singleton;/**
 * @auther silly goose
 * @date 2023/5/25
 * @apiNote
 */

/**
 * 静态内部类
 * JVM 保证单例
 * 加载外部类时不会加载内部类, 这样可以实现懒加载
 *
 * @Author silly goose
 * @Description //TODO $
 * @Date $ $
 **/
public class Mgr03 {

    private Mgr03() {
    }

    private static class Mgr03Holder{
        private final static Mgr03 INSTANCE = new Mgr03();
    }

    public static Mgr03 getInstance(){
        return Mgr03Holder.INSTANCE;
    }

    public void doSomething(){
        System.out.println("dosomething...........");
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
