package com.syntax.program;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        /*
        how HashMaps work internally
        https://www.geeksforgeeks.org/internal-working-of-hashmap-java/
         */

        int a = 4;
        int b = 2;
        int c = 8;

        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("a", 10);
        myMap.put("b", 2);
        myMap.put("c", 8);

        System.out.println(myMap);
        System.out.println(myMap.get("a"));

        //user passwords
        HashMap<String, String> passwords = new HashMap<String, String>();
        passwords.put("Jose", "passwo123");
        passwords.put(null, "pakjuwn123");
        passwords.put("Waldo", "PASswo123");
        passwords.put("Jane", "passwd13");
        passwords.put("Steff", "pswo123");
        System.out.println(passwords.clone());
        System.out.println("Regular print");
        System.out.println(passwords);
        int hash = passwords.get(null).hashCode();
        int hash1 = passwords.get("Waldo").hashCode();
        int hash2 = passwords.get("Jane").hashCode();
        System.out.println("Null hash: " + hash);
        System.out.println("Waldo hash: " + hash1);
        System.out.println("Jane hash: " + hash2);

    }
}
