package com.syntax.class31;

import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();

        cities.add("Apple");
        cities.add("Alexandria");
        cities.add("Monrovia");
        cities.add("Sacramento");
        cities.add("Miami");
        cities.add("DC");
        cities.add("Waldorf");
        System.out.println(cities);
        cities.addFirst("Salvador");
        cities.addLast("Danville");
        cities.add(2, "Roanoke");
        System.out.println(cities);
    }
}
