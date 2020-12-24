package com.syntax.program;

public class Encapsulation {
    //encapsulation is used to reduce work for the user of this class
    //instead of creating an object like this
    //Encapsulation student1 = new Student();
    //student1.age = 11;
    //student1.address = "address goes here"
    //student1.name = "James";
    //this is for a set of students and to access the vars we use the set and get methods
    private String name, address;
    private int age;
    private int grade;

    //create a method to set the name
    //leave out the static because we don't want to create an object to access
    //to create a getter and setter use alt + insert


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String newName) {
        this.name = newName; // this keyword not needed
    }
    public String getName() {
        return this.name;
    }
    //setting and getting address
    public void setAdress(String newAddress) {
        address = newAddress; // if the parameter above has the same name then we would need to use this.address = address
    }
    public String getAddress() {
        return this.address;
    }
    //setting and getting address
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public int getAge() {
        return this.age;
    }
}

class EncapsulationTest {
    public static void main(String[] args) {
        Encapsulation student1 = new Encapsulation();
        student1.setName("Timmy");
        student1.setAge(7);
        student1.setGrade(10);
        student1.setAdress("4114 Maple St. Coriander USA");
        System.out.println(student1.getName() + " is this many years old: " + student1.getAge() + "," +
                " his address is : " + student1.getAddress() + " and is in grade: " + student1.getGrade());

    }
}