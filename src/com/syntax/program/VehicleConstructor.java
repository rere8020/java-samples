package com.syntax.program;

//constructors can be used to call methods

public class VehicleConstructor {

    VehicleConstructor() {
        System.out.println("default constructor");
    }

    String fuel;
    int wheelAmount, yearBuilt;
    boolean licenseRequired;

    public VehicleConstructor(String fuelType, int wheelAmount) {
        fuel = fuelType;
        this.wheelAmount = wheelAmount;
    }
    public VehicleConstructor(boolean licenseRequired) {
        this.licenseRequired = licenseRequired;
    }
    VehicleConstructor(int yearBuilt) {
        this.yearBuilt = yearBuilt;
        checkYearBuilt(yearBuilt);
        isTransparent();
    }
    public void checkYearBuilt(int yearBuilt) {
        if(yearBuilt < 2000) {
            System.out.println("Your vehicle was built before 2000, it needs to be at least a 2000.");
            this.yearBuilt = yearBuilt;
            System.exit(1);
        }

    }
    public void isTransparent() {
        System.out.println("Your vehicle is not transparent.");
    }
}
