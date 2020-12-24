package com.syntax.program;


import java.util.Scanner;

public class SwitchStatement {

    public static void main(String... f) {
        System.out.println("How old are you? ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println();
        switch (age) {
            case 18:
                System.out.println("You can't drink");
                break;
            case 21:
                System.out.println("You can drink");
                break;
            default:
                System.out.println("under 21, you can't drink");
                break;
        }

        int month = 2;
        int year = 2000;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                + numDays);


    }
}