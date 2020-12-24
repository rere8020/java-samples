package com.syntax.program;

public class Fibonacci {

    //Need help understanding the int sum and t1 and t2 assignments

    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;

            t1 = t2;

            t2 = sum;

        }
    }
}
