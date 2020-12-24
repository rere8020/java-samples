package com.syntax.program;

import java.util.Scanner;

public class StringBuild {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        //write your code below

        // This will hold any matching vowels we find
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            // Check if our list of vowels contains the current char. If the current char exists in the String of vowels, it will have an index of 0 or greater.
            if ("AEIOUaeiou".indexOf(word.charAt(i)) >= 0) {

                // If so, add it to our StringBuilder
                sb.append(word.charAt(i));
            }
        }

        // Finally, print the result
        System.out.println(sb.toString());
    }

}
