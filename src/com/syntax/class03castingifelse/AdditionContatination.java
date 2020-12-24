package com.syntax.class03castingifelse;

public class AdditionContatination {
    public static void main(String[] args) {
        String hello = "hello";
        int num = 10;
        byte bit = 0;
        boolean isGreen = true; //can't concat with long below
        long longNum = 1986309;

        System.out.println(longNum + hello + isGreen + " " + num + bit); //can add insts with strings
    }
}
