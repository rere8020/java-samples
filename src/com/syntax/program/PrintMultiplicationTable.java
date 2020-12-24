package com.syntax.program;

public class PrintMultiplicationTable {

    public static void main(String[] args) {
        int num = 5;
        for(int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " * " + i + " = " + product );
        }

        //using a while loop
        System.out.println("\nusing while loop");
        int num2 = 6, i = 1;
        while(i <= 10) {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }

    }
}
