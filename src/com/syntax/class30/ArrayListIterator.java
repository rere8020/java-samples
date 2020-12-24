package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

    public static void main(String[] args) {
//        ArrayList<String> array = new ArrayList<>();
//        array.add("name1");
//        array.add("name2");
//        array.add("name3");
//        array.add("name4");
//        array.add("name5");
//
//        System.out.println("using enhanced for loop");
//        for(String name: array) {
//            System.out.println(name);
//        }
//        System.out.println("using a regular for loop");
//        for(int i = 0; i < array.size(); i++) {
//            System.out.println(array.get(i));
//        }
//        System.out.println("using a while loop");
//        int index = 0;
//        while(index < array.size()) {
//            System.out.println(array.get(index));
//            index++;
//        }
//        System.out.println("using iterator");
//        Iterator<String> iterator = array.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        String[] array = new String[]{"This", "is", "array", "of", "strings"};
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
