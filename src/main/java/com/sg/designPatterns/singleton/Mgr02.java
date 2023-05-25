package com.sg.designPatterns.singleton;/**
 * @auther silly goose
 * @date 2023/5/25
 * @apiNote
 */

/**
 * 双重检测 懒汉加载
 *
 * 按需初始化, 但会导致线程不安全的问题
 *
 * @Author silly goose
 * @Description //TODO $
 * @Date $ $
 **/
public class Mgr02 {
    // volatile 防止指令重排
    private static volatile Mgr02 INSTANCE;

    private Mgr02() {
    }

    public static Mgr02 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mgr02.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr02();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr02.getInstance().hashCode());
            }).start();
        }
    }
}
