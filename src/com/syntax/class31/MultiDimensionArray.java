package com.syntax.class31;

import java.util.ArrayList;

public class MultiDimensionArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<Integer> innerArray = new ArrayList<>();

        innerArray.add(10);
        innerArray.add(20);
        innerArray.add(30);
        innerArray.add(40);
        ArrayList<Integer> innerArray1 = new ArrayList<>();
        innerArray1.add(50);
        innerArray1.add(60);
        innerArray1.add(70);
        innerArray1.add(80);

    }
}
