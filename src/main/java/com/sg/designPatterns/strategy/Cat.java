package com.sg.designPatterns.strategy;/**
 * @auther silly goose
 * @date 2023/5/25
 * @apiNote
 */

/**
 * 猫
 * @Author silly goose
 * @Description //TODO $
 * @Date $ $
 **/
public class Cat {
    int weight, height;

    public Cat(int weight, int height) {
        this.height = height;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

}
