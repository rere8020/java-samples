package com.syntax.program;

public class TryExcept {

    public static void main(String[] args) {
        try{
            int num1 = 60;
            int num2 = 0;
            int num3 = num1/num2;

            System.out.println(num2);
            System.out.println("This will not print if above fails.");
        }

        catch (ArithmeticException t){
            System.out.println("You should not divide by zero");
        }
        catch (Exception r) {
            System.out.println("An exception occurred.");
        }

        System.out.println("I am not in the try/catch block");

    }
}
