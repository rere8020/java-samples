package com.syntax.class30;

import java.util.ArrayList;

public class ArraysList {

    public static String[] expandArray(String[] oldArray) {
        String[] newArray = new String[oldArray.length * 2]; //2 doubles the array so as to not recreate array until double the size of new array
        for(int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }
    //instead of implementing expandArray above we use below
    public static void main(String[] args) {
        ArrayList<String> dynamicArray = new ArrayList<>();
        //will not accept int
        //ArrayList<int> dynamicArray2 = new ArrayList<int>();
        dynamicArray.add("joe");
        dynamicArray.add("moe");
        dynamicArray.add("doe");
        dynamicArray.add("ren");
        dynamicArray.add("jose");


    }

}
