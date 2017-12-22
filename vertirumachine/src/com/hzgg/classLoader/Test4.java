package com.hzgg.classLoader;

/**
 * Created by Administrator on 2017/12/22.
 */
public class Test4 {
    public static void main(String[] args) {
        Parent2 parent2;
        System.out.println("----------------------");
        parent2 = new Parent2();

        System.out.println(Parent2.a);
        System.out.println(Child2.b);
    }
}
class Parent2{
    static int a =3;
    static{
        System.out.println("parent2 static block");
    }
}
class Child2 extends  Parent2{
    static int b =4;
    static{
        System.out.println("child2 static block");
    }
}
