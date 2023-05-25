package com.sg.designPatterns.strategy;/**
 * @auther silly goose
 * @date 2023/5/25
 * @apiNote
 */

/**
 * 狗
 * 比较策略 食量
 * @Author silly goose
 * @Description //TODO $
 * @Date $ $
 **/
public class DogComparator implements Comparator<Dog>{
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food < o2.food) {
            return -1;
        }
        if (o1.food == o2.food) {
            return 0;
        }
        return 1;
    }
}
