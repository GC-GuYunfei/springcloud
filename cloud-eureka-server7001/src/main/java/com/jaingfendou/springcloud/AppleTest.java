package com.jaingfendou.springcloud;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppleTest {

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Apple apple1 = new Apple("green", 160);
        Apple apple2 = new Apple("red", 150);
        Apple apple3 = new Apple("pink", 140);
        Apple apple4 = new Apple("yellow", 175);
        Apple apple5 = new Apple("green", 120);
        Apple apple6 = new Apple("green", 152);
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        apples.add(apple4);
        apples.add(apple5);
        apples.add(apple6);
//        Apple.filterApples(apples, Apple::isGreenApple);
//        Apple.filterApples(apples, (Apple a) -> "green".equals(a.getColor()));
        List<Apple> collect = apples.stream().filter(apple -> "green".equals(apple.getColor())).collect(Collectors.toList());
        System.out.println(collect.size());
    }





}
