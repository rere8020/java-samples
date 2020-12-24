package com.syntax.review7;

public class InstanceVariable {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); //creates a new copy of the Dog class and access to methods and vars in class
        System.out.println(dog1.age);
        System.out.println(dog1.height);
        System.out.println(dog1.isAggressive);
        System.out.println(dog1.height);

        dog1.age = 5;
        dog1.height = 5.0;
        dog1.isAggressive = false;
        dog1.weight = 50;
        System.out.println(dog1.age);
        dog1.printProperties();
    }

    static class Student {
        //static vars are used when variables should be constant
        static int totalStudents;
        static final String schoolName = "Syntax";
        String name;
        final static int MAX_STUDENTS_ALLOWED = 2;
        Student() {
            totalStudents++;
        }

        void printInfo() {
            System.out.println("Name of the student " + name + " Name of the school " + schoolName +
                    " Total students registered " + totalStudents);
        }
    }
}
