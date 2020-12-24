package com.syntax.program;


public abstract class Animal {

    static int animalCount = 0;
    private String heterotrophs = "This animal is a heterotroph";
    String animal;
    public Animal(String animal) {
        this.animal = animal;
    }

    public abstract void legs();
    public abstract void foodEaten();


    boolean canBeDomesticated = false;

    public void isDomesticated() {
        System.out.println("Can be domesticated");
    }

    public void animalMoves() {
        System.out.println("This animal runs on four legs");
    }

    public void livesInZoo() {
        animalCount++;
    }

    public void animalsInZoo() {
        if(animalCount == 1) {
            System.out.println(animalCount + " animal currently lives in the zoo.");
        } else {
            System.out.println(animalCount + " animals currently live in the zoo.");
        }

    }

    public String getheterotrophs() {
        return heterotrophs;
    }

}
