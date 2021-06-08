package com.jaingfendou.springcloud;

import org.springframework.beans.factory.annotation.Autowired;

public class Dome {

    //没有参数的运算
    interface NoParamOperation {
        double operation();
    }

    //一个参数的运算
    interface SingleParamOperation {
        int operation(int a);
    }

    //两个参数的运算
    interface MathOperation {
        double operation(double a, double b);
    }

    public static void main(String[] args) {

        //======几种Lambda表达式的写法=============

        //得到PI值（没有参数，直接返回）
        NoParamOperation pi = () -> Math.PI;

        //得到自然常数 （没有参数，直接返回，如果有花括号，要写上显式的加上return）
        NoParamOperation e = () -> {
            return Math.E;
        };

        //求平方（如果参数是一个，可以省略小括号）
        SingleParamOperation square = a -> a * a;

        //求立方（可以指定参数的类型，如果没有编译器会自动推算）
        SingleParamOperation cubic = (int a) -> a * a * a;

        //加法（如果多个参数，就必须添加上小括号）
        MathOperation add = (double a, double b) -> a + b;

        //减法（多个参数，也可以不指定参数的数据类型）
        MathOperation sub = (a, b) -> a - b;

        //乘法（一行代码，函数体上也可以写上花括号）
        MathOperation mult = (double a, double b) -> {
            return a * b;
        };

        //除法（如果函数体有多行，就必须有花括号）
        MathOperation div = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                return 0;
            }
        };

        System.out.println("PI的值" + pi.operation());
        System.out.println("自然常数E的值:" + e.operation());

        System.out.println("10的平方:" + square.operation(10));
        System.out.println("10的立方:" + cubic.operation(10));

        System.out.println("20+10:" + add.operation(20, 10));
        System.out.println("20-10:" + sub.operation(20, 10));
        System.out.println("20*10:" + mult.operation(20, 10));
        System.out.println("20/10:" + div.operation(20, 10));
    }
}
