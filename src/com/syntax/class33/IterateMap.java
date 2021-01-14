package com.syntax.class33;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMap {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("name1", 111);
        hashMap.put("name2", 222);
        hashMap.put("name3", 333);
        hashMap.put("name4", 444);
        hashMap.put("name5", 555);

        System.out.println("using Map.entryset()");
        for(Map.Entry<String, Integer> enter : hashMap.entrySet()) {
            System.out.println(enter.getKey());
            System.out.println(enter.getValue());
        }

        System.out.println("Using keyset() method *******");

        for(String name: hashMap.keySet()) {
            System.out.println(name);
        }
        for(Integer social: hashMap.values()) {
            System.out.println(social);
        }

        System.out.println("Using Iterator");
        Iterator<Map.Entry<String, Integer>> iter = hashMap.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            System.out.println("Key: " + entry.getKey() + " Value " + entry.getValue());
        }


    }

}
