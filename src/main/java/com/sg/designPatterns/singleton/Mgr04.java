package com.sg.designPatterns.singleton;/**
 * @auther silly goose
 * @date 2023/5/25
 * @apiNote
 */

/**
 * Java创始人 写于Effective Java
 *  枚举式创建
 *  不仅可以解决线程同步 还可以防止反序列化
 * @Author silly goose
 * @Description //TODO $
 * @Date $ $
 **/
public enum Mgr04 {

    INSTANCE;

    public void doSomething() {
        System.out.println("dosomething...........");
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr04.INSTANCE.hashCode());
            }).start();
        }
    }
}
