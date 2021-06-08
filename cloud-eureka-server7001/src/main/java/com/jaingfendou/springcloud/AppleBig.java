package com.jaingfendou.springcloud;

import java.util.ArrayList;
import java.util.List;

public class AppleBig {

    private String color;

    private Integer weight;

    public AppleBig(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public AppleBig() {
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

    public static boolean isGreenApple(AppleBig apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(AppleBig apple) {
        return apple.getWeight() > 150;
    }

    public interface Predicate<T> {
        boolean test(T t);
    }

    public static List<AppleBig> filterApples(List<AppleBig> apples, Predicate<AppleBig> p) {
        List<AppleBig> appleArrayList = new ArrayList<>();
        for (AppleBig apple:apples) {
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
