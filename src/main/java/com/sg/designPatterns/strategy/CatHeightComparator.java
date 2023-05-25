package com.sg.designPatterns.strategy;/**
 * @auther silly goose
 * @date 2023/5/25
 * @apiNote
 */

/**
 * 猫
 * 策略: 身高比较
 * @Author silly goose
 * @Description //TODO $
 * @Date $ $
 **/
public class CatHeightComparator implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height < o2.height) {
            return -1;
        }
        if (o1.height == o2.height) {
            return 0;
        }
        return 1;
    }
}
