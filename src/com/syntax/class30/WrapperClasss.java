package com.syntax.class30;

import java.util.ArrayList;

public class WrapperClasss {
    public static void main(String[] args) {
        //8 primitive types
        byte byteNum = 127; //-128-127
        short shortNum = 1000;
        int number = 10;
        float floatNum = 1247.3457f;
        long longNum = 576532128;
        double mdouble = 10.5;
        char myChars = 'A';
        boolean flag = true;

        //this allows us to call on methods from Integer class
        Integer myInt = 20;
        String num = myInt.toString();
        System.out.println("Hello " + num);

        String intString = "13";
        int convertedNum = Integer.parseInt(intString);
        System.out.println(convertedNum * 2);

        //auto boxing is assigning a primitive to non-primative
        //auto unboxing is the opposite
        int num1 = 1;
        Integer nonPrimative = 34; //auto boxing putting them into objects
        int primative = nonPrimative; //auto unboxin
        Integer integer = new Integer(10); //boxing and longer than autoboxing
        int oneNumber = integer.intValue(); //unboxin

    }
}
