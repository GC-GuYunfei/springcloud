package com.jaingfendou.springcloud;


import org.springframework.beans.BeanUtils;

public class Test {

    public static void main(String[] arge) {

        Apple apple = new Apple("green", 160);
        AppleBig appleBig = new AppleBig();
        BeanUtils.copyProperties(apple, appleBig);
        System.out.println("appleColor" + appleBig.getColor());
    }
}
