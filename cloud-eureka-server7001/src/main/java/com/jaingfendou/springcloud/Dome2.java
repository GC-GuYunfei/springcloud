package com.jaingfendou.springcloud;

public class Dome2 {

    //两个参数的运算
    interface MathOperation {
        double operation(String format, double a, double b);
    }

    public static void main(String[] rge) {
        Demo2Util demo2Util = new Demo2Util();

        // lambda 表达式写法
        MathOperation mathOperation = (f, a, b) -> demo2Util.formatPrint(f, a, b);

        // 更简单的写法
        MathOperation mathOperation1 = demo2Util::formatPrint;

        mathOperation.operation("匿名类的方式：%f\n", 20, 10);
        mathOperation1.operation("Lambda方式：%f\n", 20, 10);

    }
}
