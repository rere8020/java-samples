package com.syntax.program;

public class SwapNumbers {
    public static void main(String[] args) {
        double first = 4.0, second = 7.0;
        System.out.println();
        System.out.println("Before swap " + first + " " + second);

        double tempFirst = first;

        first = second;

        second = tempFirst;

        System.out.println();
        System.out.println("After swap " + first + " " + second);

    }
}
