package com.syntax.class31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();

        //no order, do duplicates
        hashset.add("apple");
        hashset.add("orange");
        hashset.add("mandarin");
        hashset.add("fig");
        hashset.add("mango");
        hashset.add("apple");
        System.out.println(hashset);
    }
}