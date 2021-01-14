package com.syntax.class33;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedHash {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("name1", 111);
        hashMap.put("name2", 222);
        hashMap.put("name3", 333);
        hashMap.put("name4", 444);
        hashMap.put("name5", 555);

        System.out.println(hashMap);

        Map<String, Integer> linkedHashmap = new LinkedHashMap<>();
        linkedHashmap.put("student1", 001);
        linkedHashmap.put("student2", 002);
        linkedHashmap.put("student3", 003);
        linkedHashmap.put("student4", 004);
        linkedHashmap.put("student5", 005);

        System.out.println(linkedHashmap);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("abel", 001);
        treeMap.put("sam", 002);
        treeMap.put("tom", 003);
        treeMap.put("cindy", 004);
        treeMap.put("mindy", 005);

        System.out.println(treeMap); //prints in alphabetical order
    }

}
