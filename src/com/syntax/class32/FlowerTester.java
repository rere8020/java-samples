package com.syntax.class32;

import java.util.ArrayList;

public class FlowerTester {
    public static void main(String[] args) {
        ArrayList<Flower> flowerArrayListList = new ArrayList<>();
        flowerArrayListList.add(new SunFlower("Sunflower", "Yellow"));
        flowerArrayListList.add(new Tulip("Tulip", "Pink"));
        flowerArrayListList.add(new Tulip("Tulip", "Red"));

        for (Flower flower: flowerArrayListList
             ) {
            System.out.println();
            System.out.println("Name " + flower.name + " Color " + flower.color);
            flower.bloom();
        }

    }
}
