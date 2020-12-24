package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArray {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Tea");
        drinks.add("coffee");
        drinks.add("milk");
        drinks.add("soda");
        drinks.add("chai");
        drinks.add("juice");
        drinks.add("vodka");

        Iterator<String> iterator = drinks.iterator();
        while(iterator.hasNext()) {
            //next got extracted so tha the and the pointer for the index will move and give error
            String next = iterator.next();
            if(next.equals("juice") || next.equals("vodka") || next.equals("chai")) {
                iterator.remove();
            }
        }
        System.out.println(drinks);

    }
}
