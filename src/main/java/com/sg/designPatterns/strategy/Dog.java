package com.sg.designPatterns.strategy;/**
 * @auther silly goose
 * @date 2023/5/25
 * @apiNote
 */

/**
 * 狗
 * @Author silly goose
 * @Description //TODO $
 * @Date $ $
 **/
public class Dog{
    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
