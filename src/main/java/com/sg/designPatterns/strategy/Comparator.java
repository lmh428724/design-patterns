package com.sg.designPatterns.strategy;

/**
 * 策略接口
 * @auther silly goose
 * @date 2023/5/25
 * @apiNote
 */
public interface Comparator<T> {
    int compare(T o1,T o2);
}
