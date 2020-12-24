package com.syntax.class03castingifelse;

public class PrimitiveCasting {
    public static void main(String[] args) {
        double d = 12/7; //prints 1.0
        double z = 12.0/7.0; //prints 1.7142857142857142
        double e = 9;
        //int i = 9.99; //will not allow to compile
        //narrowing
        int i = (int) 9.99; //explicitly casting to int lose info returns 9

        //widening
        double myDouble = 9;


        System.out.println(i);
        System.out.println(d);
        System.out.println(z);
    }
}
