package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayClassDemo2 {

    public static void main(String[] args) {
        ArrayList<Double> doubleArray = new ArrayList<>();
        doubleArray.add(20.5);
        doubleArray.add(6.5);
        doubleArray.add(10.5);
        doubleArray.add(40.5);
        //throws error, trying to perform two actions at once
//        for(Double element: doubleArray) {
//            if(element < 20.0) {
//                doubleArray.remove(element);
//            }
//            System.out.println(doubleArray);
//        }
        //Error because it removes elements and elements shift indexes and some will not get read
        //Not recommended to this, error prone
//        for(int i = 0; i < doubleArray.size(); i++) {
//            if(doubleArray.get(i) < 20.0) {
//                doubleArray.remove(doubleArray.get(i));
//            }
//        }
//        System.out.println("After removing");
//        System.out.println(doubleArray);

        //Use iterator method instead
        Iterator<Double> iterator = doubleArray.iterator();
//        while(iterator.hasNext()) {
//            iterator.next();
//            if(iterator.next() < 20.00) {
//                iterator.remove();
//            }
//        }
        System.out.println("Before the while loo");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println(iterator.next());
        }
        System.out.println(doubleArray);
    }
}
