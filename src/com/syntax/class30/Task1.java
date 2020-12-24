package com.syntax.class30;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("name1");
        array.add("name2");
        array.add("name3");
        array.add("name4");
        array.add("name5");
        System.out.println("full array " + array);
        array.clear();
        System.out.println("\nprinting a cleared array " + array);
        Collections.sort(array);

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("name6");
        array2.add("name7");
        array2.add("name8");
        array2.add("name9");
        array2.add("name10");
        array2.addAll(array);
        //starts adding the array on index 1
        array2.addAll(1, array);
        System.out.println("combining the two arrays " + array2);
        //removes what is inside argument
        array.retainAll(array2);
        System.out.println("\nprinting retained elements");
        System.out.println(array);
        System.out.println("\nsorting array by alphbetical order");

        System.out.println();
        System.out.println("is array empty? "+ array.isEmpty());
        System.out.println("\ncontains name1: " + array.contains("name1"));
        System.out.println("index of name1 is: " + array.indexOf("name1"));
        System.out.println("\narray size: " + array.size());
        System.out.println("\nthe array contains these values " + array);

        array2.removeAll(array);
        System.out.println(array2);
    }

}
