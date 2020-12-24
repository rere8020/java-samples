package com.syntax.class31;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

//        Set<String> treeSet = new TreeSet<>();
//        TreeSet.add("apple");
//        TreeSet.add("orange");
//        TreeSet.add("mandarin");
//        TreeSet.add("fig");
//        TreeSet.add("mango");
//        TreeSet.add("apple");
//        System.out.println(treeSet);

        int[][] array = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }



}
