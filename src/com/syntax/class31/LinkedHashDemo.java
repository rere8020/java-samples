package com.syntax.class31;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashDemo {

    public static void main(String[] args) {
        Set<String> linkedHash = new LinkedHashSet<>();
        //no duplicate outputs
        //the input order will be the same output order
        linkedHash.add("apple");
        linkedHash.add("orange");
        linkedHash.add("mandarin");
        linkedHash.add("fig");
        linkedHash.add("mango");
        linkedHash.add("apple");
        System.out.println(linkedHash);
    }

}
