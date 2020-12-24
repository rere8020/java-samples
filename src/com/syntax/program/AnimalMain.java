package com.syntax.program;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog");
        dog1.foodEaten();
        dog1.animalMoves();
        System.out.println(dog1.getheterotrophs());
        System.out.println("**************");


        Cheetah cheetah = new Cheetah("Cheetah");
        System.out.println(cheetah.animal + " is " + cheetah.speed);
        cheetah.foodEaten();
        cheetah.livesInZoo();
        System.out.println(cheetah.getheterotrophs());
        System.out.println("Cheetah can be domesticated: " + cheetah.canBeDomesticated);


        System.out.println("**************");
        System.out.println();
        cheetah.animalsInZoo();



    }
}
