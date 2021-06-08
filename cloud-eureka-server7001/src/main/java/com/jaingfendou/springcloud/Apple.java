package com.jaingfendou.springcloud;

import java.util.ArrayList;
import java.util.List;

public class Apple {

    private String color;

    private Integer weight;

    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    public interface Predicate<T> {
        boolean test(T t);
    }

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> p) {
        List<Apple> appleArrayList = new ArrayList<>();
        for (Apple apple:apples) {
            if (p.test(apple)) {
                appleArrayList.add(apple);
            }
        }
        return appleArrayList;
    }

    public static void main(String[] args) {
        Demo2Util.say();
    }




}
