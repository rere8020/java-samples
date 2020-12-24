package com.syntax.program;

public class Inheritance1 {
    //based a a guitar
    private int num1 = 1;
    //methods and instance variables need to be public to be accessed from another package
    String woodType = "Cedar", make = "Fender", countryOfOrigin = "USA";
    public boolean isAcoustic = false;

    public void plays() {
        System.out.println("Plays a beatiful melody.");
    }

    public int getNum1() {
        return num1;
    }
}
