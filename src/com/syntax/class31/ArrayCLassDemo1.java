package com.syntax.class31;

import java.util.ArrayList;

public class ArrayCLassDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArray = new ArrayList<>();
        doubleArray.add(20.5);
        doubleArray.add(6.5);
        doubleArray.add(10.5);
        doubleArray.add(40.5);
        System.out.println("Before replacement");
        System.out.println(doubleArray);
        //replace an element [1] of the array
        doubleArray.set(1, 66.7);
        System.out.println("\nAfter replacement");
        System.out.println(doubleArray);
        //remove an element from array
        //System.out.println("\nRemoving index 0");
        //doubleArray.remove(0);
        System.out.println(doubleArray);
        //print the numbers using enhanced
        for(Double singleNum: doubleArray) {
            System.out.println(singleNum);
        }

        System.out.println("array size " + doubleArray.size());

        //print numbers in reverse
        System.out.println();
        for(int i = doubleArray.size() - 1; i >= 0; i--) {
            System.out.println(doubleArray.get(i));
        }

    }
}
