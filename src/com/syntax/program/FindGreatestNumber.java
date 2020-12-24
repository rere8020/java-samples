package com.syntax.program;

public class FindGreatestNumber {
    //using an array and nested if else statements

    public static void main(String[] args) {
        double n1 = -4.5, n2 = 3.9, n3 = 38.5;

        if(n1 >= n2) {
            if(n1 >= n3) {
                System.out.println(n1 + " is the largest number");
            } else {
                System.out.println(n3 + " is the largest number");
            }
        } else if (n2 >= n3) {
            System.out.println(n2 + " is the largest number");
        } else {
            System.out.println(n3 + " is the largest number");
        }

        int[] myArray = {50, 4, 5, 76 , 7, 9};

        int largest = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] >= largest)
                largest = myArray[i];
        }
        System.out.println("Largest number is " + largest);
    }
}
