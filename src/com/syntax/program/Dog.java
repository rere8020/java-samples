package com.syntax.program;

public class Dog extends Animal {
    public Dog(String animal) { //this needs to be implemented in all subclasses
        super(animal);
    }

    @Override
    public void legs() {
        System.out.println("Dog has 4 legs");
    }

    @Override
    public void foodEaten() {
        System.out.println("Dog eats bagged dog food");
    }
}
