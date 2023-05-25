package com.sg.designPatterns.strategy;/**
 * @auther silly goose
 * @date 2023/5/25
 * @apiNote
 */

/**
 * 驱动类
 * @Author silly goose
 * @Description //TODO $
 * @Date $ $
 **/
public class Main {
    public static void main(String[] args) {
        Cat[] a = {new Cat(1, 6), new Cat(2, 2), new Cat(3, 1)};
        Sorter<Cat> sorter = new Sorter<>();
        System.out.println("体重比较器");
        sorter.sort(a,new CatWeightComparator());
        for (Cat cat : a) {
            System.out.println(cat);
        }
        System.out.println("身高比较器");
        sorter.sort(a,new CatHeightComparator());
        for (Cat cat : a) {
            System.out.println(cat);
        }
    }
}
