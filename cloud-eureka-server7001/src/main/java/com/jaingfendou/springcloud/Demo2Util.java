package com.jaingfendou.springcloud;

public class Demo2Util {
    int a;

    //这里将方法放到一个类中
    public double formatPrint(String format, double a, double b) {
        double r = a + b;
        System.out.format(format, r);
        return r;
    }

    public static void say() {
        int a;
        a = 1 + 1;
        System.out.println(a);
    }

}
