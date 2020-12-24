package com.syntax.program;

public class ComputerLenovoOverriding extends ComputerMethodOverriding {

    //to acccess the super class method use the super keyword
    @Override
    public void developer(String brand) {
        super.developer(brand);
        System.out.println("Lenova are a cheap developer laptop.");
    }


    public static void main(String[] args) {
        ComputerLenovoOverriding lenovo = new ComputerLenovoOverriding();
        lenovo.developer("Lenovo");
    }
}
