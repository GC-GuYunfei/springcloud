package com.jaingfendou.springcloud;

public class Dome5 {

    //计算器类
    static class Calculator {

        //计算器类,一个参数的构造函数
        public Calculator(String name) {
            this.name = name;
        }

        //计算器类,两个参数的构造函数
        public Calculator(Integer id,String name)
        {
            this.id=id;
            this.name=name;
        }
        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    //计算器接口，有一个创建计算器的方法
    interface ICalculator {
        Calculator create(String name);
    }
    //计算器接口，有两参数个创建计算器的方法
    interface ICalculator2 {
        Calculator create(Integer id,String name);
    }

    public static void main(String[] args) {
        //第1种方式：内部类方式创建电脑对象和中国算盘对象
        ICalculator pc1 = new ICalculator() {
            @Override
            public Calculator create(String name) {
                return new Calculator(name);
            }
        };
        ICalculator2 pc11=new ICalculator2() {
            @Override
            public Calculator create(Integer id, String name) {
                return new Calculator(id,name);
            }
        };

        //第2种方式：用Lambda表达式创建
        ICalculator pc2 = (name) -> new Calculator(name);
        ICalculator2 pc22=(id,name)->new Calculator(id,name);

        //第3种方式：用方法引用方式进一步简化Lambda表达式。
        ICalculator pc3 = Calculator::new;
        ICalculator2 pc33=Calculator::new;

        Calculator c1 = pc1.create("电脑1");
        Calculator c11 = pc11.create(11,"电脑11");
        Calculator c2 = pc2.create("电脑2");
        Calculator c22=pc22.create(22,"电脑22");
        Calculator c3 = pc3.create("电脑3");
        Calculator c33=pc33.create(33,"电脑33");
    }
}
