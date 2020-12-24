package com.syntax.program;

public class GreatestUsingIf {
    public static void main(String[] args) {

        int n1 = 14, n2 = 16, n3 = 12;

        if(n1 >= n2) { //as soon as one of these statements becomes false it jumps out
            if(n1 >= n3) {
                System.out.println(n1 + " is the greatest");
            } else {
                System.out.println(n3 + " is the greatest");
            }
        } else if(n2 >= n3) {
            System.out.println(n2 + " is the greatest");
        } else {
            System.out.println(n3 + " is the greatest");
        }

    }
}
