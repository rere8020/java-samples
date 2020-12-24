package com.syntax.review7;


public class StaticVar {
    static int num;
    static String mystr;
    static {
        num = 97;
        mystr = "Static keyword in Java";
    }

    //static can be used with class, method, variable, block
    static void myMethod() {
        System.out.println("My method is printing out");
    }

    public static void main(String[] args) {
        myMethod();
        System.out.println();
        num = 100;
        System.out.println("Value of num " + num);
        System.out.println("Value of mystr " + mystr);
    }
}
