package com.syntax.program;

public class Cheetah extends Animal {
    String speed = "fast";

    public Cheetah(String animal) { //this needs to be implemented in all subclasses
        super(animal);
    }

    @Override
    public void legs() {
        System.out.println("Cheetah runs on four legs");
    }

    @Override
    public void foodEaten() {
        System.out.println("Cheetah eats animals that it can hunt");
    }

}
