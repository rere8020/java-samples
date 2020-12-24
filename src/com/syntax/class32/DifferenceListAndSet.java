package com.syntax.class32;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DifferenceListAndSet {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("orange");
        hashSet.add("mandarin");
        hashSet.add("fig");
        hashSet.add("mango");
        hashSet.add("apple");
        //to access elements from the se
        for (String element: hashSet
             ) {
            System.out.println(element);
        }

        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("orange");
        arrayList.add("mandarin");
        arrayList.add("fig");
        arrayList.add("mango");
        arrayList.add("apple");
        System.out.println();
    }
}
