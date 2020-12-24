package com.syntax.review7;

class Dog {
    //instance vars are assigned default values
    String name; //null
    int age; //0
    double weight; //0.0
    double height;
    boolean isAggressive; //false

    void printProperties() {
        System.out.println("Name " + name + " Age " + age +
                " Weight " + weight + " isAggressive " + isAggressive);
    }

}
