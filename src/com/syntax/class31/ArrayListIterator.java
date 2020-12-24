package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Double> doubleArray = new ArrayList<>();
        doubleArray.add(20.5);
        doubleArray.add(6.5);
        doubleArray.add(10.5);
        doubleArray.add(40.5);

        Iterator<Double> iterator = doubleArray.iterator();
        System.out.println("Before removing elements");
        System.out.println(doubleArray);
        while(iterator.hasNext()) {
            if(iterator.next() < 20) {
                iterator.remove();
            }

        }
        System.out.println("\nAfter removing elements");
        System.out.println(doubleArray);

        //this throws an error because there are no more elements after the iteration
        //to solve you need to create another object of iteration
        //iterator is not renewable
        //System.out.println(iterator.next());

        System.out.println("Printing two elements at a time");
        Iterator <Double> iterator1 = doubleArray.iterator();
        //this will throw an error if there is odd number of elements in array
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
            System.out.println(iterator1.next());
        }

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Apple");
        cities.add("Alexandria");
        cities.add("Monrovia");
        cities.add("Sacramento");
        cities.add("Miami");
        cities.add("DC");
        cities.add("Waldorf");

        //Remove elements with next() method
        Iterator<String> iterator2 = cities.iterator();
        while(iterator2.hasNext()) {
            if(iterator2.next().startsWith("A"));
            iterator2.remove();
        }
        System.out.println(cities);
    }
}
