package com.syntax.oreilly;

public class IfClass {

    public static void main(String[] args) {

        int n1 = 1, n2 = 1, n3;
        System.out.print(n1 + " " + n2 );

        for (int i = 0; i <= 18; i++) {
            n3 = n1 + n2;
            System.out.print(n2 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();

    }
}
