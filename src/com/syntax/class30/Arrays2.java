package com.syntax.class30;

import java.util.ArrayList;
import java.util.List;

public class Arrays2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        //usful methods
        arrayList.add(40);
        arrayList.add(89);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(189);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        //remove index
        arrayList.remove(0);
        System.out.println(arrayList.size());
    }
}
