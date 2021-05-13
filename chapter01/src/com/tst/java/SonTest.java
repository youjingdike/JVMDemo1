package com.tst.java;
/*
成员变量（非静态的）的赋值过程： ① 默认初始化 - ② 显式初始化 /代码块中初始化 - ③ 构造器中初始化 - ④ 有了对象之后，可以“对象.属性”或"对象.方法"
 的方式对成员变量进行赋值。
 */
class Father {
    int x = 10;

    public Father() {
        this.print();
        x = 20;
    }
    public void print() {
        System.out.println("ffffffffffffffff");
        System.out.println("Father.x = " + x);
        System.out.println("ffffffffffffffff");
    }
}

class Son extends Father {
    int x = 30;
//    float x = 30.1F;
    public Son() {
        this.print();
        x = 40;
    }
    public void print() {
        System.out.println("ssssssssssss");
        System.out.println("Son.x = " + x);
        System.out.println("Father.x = " + super.x);
        System.out.println("ssssssssssss");
    }
}

public class SonTest {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.x);
        System.out.println("1~~~~~~~~~~~~~~~~~~~~");

        Father f = new Son();
        System.out.println(f.x);

        System.out.println("2~~~~~~~~~~~~~~~~~~~~");

        Son s = new Son();
        System.out.println(s.x);
    }
}
