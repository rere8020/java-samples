package com.syntax.program;

public class Inheritance1Tester extends Inheritance1{
    public static void main(String[] args) {

        boolean forBeginners = false;
        Inheritance1 guitar1 = new Inheritance1();
        guitar1.plays();
        System.out.println(guitar1.woodType);
        System.out.println(guitar1.woodType);
        System.out.println(guitar1.countryOfOrigin);
        System.out.println(guitar1.make);

        System.out.println(forBeginners);
        System.out.println(guitar1.getNum1());
    }
}
