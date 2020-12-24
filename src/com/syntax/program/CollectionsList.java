package com.syntax.program;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.*;

public class CollectionsList {
    public static void main(String[] args) {
        //working with ArrayList

        ArrayList<Integer> intList1 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            intList1.add(i);
        }

        ArrayList<Integer> intList2 =new ArrayList<Integer>();
        for(int i = 0; i < 100000; i++) {
            intList2.add(i);
        }

        System.out.println(intList2.get(99999));
        long start1 = System.currentTimeMillis();
        intList2.indexOf(99999);
        long end1 = System.currentTimeMillis();
        System.out.println("It took this many milliseconds for ArrayList: " + (end1 - start1));



//        int size = intList1.size();
//        System.out.println("Before adding intList2" + intList1);
//        intList1.addAll(2, intList2);
//        System.out.println("After adding intList2" + intList1);
//        System.out.println("Max " + Collections.max(intList1));


        List<Integer> ll = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            ll.add(i);
        }
        System.out.println("My test 1");
        Iterator<Integer> iterator2 = ll.iterator();
        while(iterator2.hasNext()) {
            Integer i = iterator2.next();
                if(i < 3) {
                    iterator2.remove();
                }
        }
        System.out.println(ll);
        //System.out.println(ll.get(99999));

        long start2 = System.currentTimeMillis();
        //ll.indexOf(99999);
        long end2 = System.currentTimeMillis();
        Iterator iterator = ll.listIterator();
        System.out.println("It took this many milli seconds for LinkedList: " + (end2 - start2));

        System.out.println("while loop");
        while(iterator.hasNext()) {
            if(iterator.next().equals(3)) {
                iterator.remove();
            }
        }
        System.out.println(ll);

        System.out.println("for loop");
        for(int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }






    }
}
