package com.syntax.program;

public class Encapsulation2 {
    //a sample used car inventory app
    private String brand, model;
    private int year;
    static int carsAvailable; //allows the use of variable accross all instances of a class
    //there is a method addVehicle and removeVehicle that keep this count

    Encapsulation2() {
        carsAvailable = 0;
    }

    public Encapsulation2(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void setBrand() {
        brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setModel() {
        model = model;
    }
    public String getModel() {
        return model;
    }

    public void setYear() {
        year = year;
    }
    public int getYear() {
        return year;
    }

    public void addVehicle() {
        System.out.println(this.year + " " + this.brand + " " + this.model + " has been added into the inventory");
        carsAvailable++;
    }

    public void removeVehicle() {
        System.out.println(this.year + " " + this.brand + " " + this.model + " has been removed from the inventory");
        carsAvailable--;
    }

}

class Main {
    public static void main(String[] args) {
        //new instance
        Encapsulation2 car1 = new Encapsulation2("BMW", "M3", 2000);
        System.out.println("Car brand: " + car1.getBrand() + " Car model: " + car1.getModel() + " Car year: " + car1.getYear());
        car1.addVehicle();
        //new instance
        System.out.println("************************");
        Encapsulation2 car2 = new Encapsulation2("Toyota", "Tacoma", 2019);
        System.out.println("My " + car2.getYear() + " " + car2.getBrand() + " " + car2.getModel() + " is the best car I have owned.");
        System.out.println("Using the addVehicle method to pass the car info as parameters");
        car2.addVehicle();
        System.out.println("************************");
        Encapsulation2 car3 = new Encapsulation2("Mercedes", "C250", 2015);
        car2.addVehicle();
        car2.removeVehicle();

        System.out.println("************************");
        System.out.println("Cars available in inventory: " + Encapsulation2.carsAvailable);
    }
}