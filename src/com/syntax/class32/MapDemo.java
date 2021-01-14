package com.syntax.class32;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //key value pairs of information

        Map<String, String> map = new HashMap<>();
        map.put("111", "Jack");
        map.put("112", "James");
        map.put("113", "Jacki");
        map.put("114", "Jon");
        map.put("115", "Jaimee");
        map.put("116", "Ja-zee");
        map.put("117", "Jai");
        System.out.println(map.get("115"));
    }
}
