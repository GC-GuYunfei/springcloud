package com.jaingfendou.springcloud;

public class Dome1 {

    //两个参数的运算
    interface MathOperation {
        double operation(double a, double b);
    }

    public static void main(String[] rge) {

        // 加法运算
        // 将内部类转换成 lambda表达式
        /**
         * 语法：（variable） -> action
         * 1、variable:方法的变量名称，可以有多个变量，如果只有一个变量，可以将小括号省略。
         * 2、action：是方法体，是自己写的代码逻辑的部分。可以是一行代码或者多行代码，如果只有一行代码，可以不要花括号，如果是多行代码，需要用花括号括起来。
         * 3、-> : 这个符号用于将变量和方法体分割开来。
         *
         * */
        MathOperation add = (double a, double b) -> a + b;

        // 减法运算
        MathOperation sub = (a, b) -> a - b;

        System.out.println("加法运算：" + add.operation( 4, 4));
        System.out.println("减法运算：" + add.operation( 10, 4));
    }
}
