package com.syntax.program;

public class IsAlphabet {

    public static void main(String[] args) {
        char myChar = '*';
        //myChar letter = 'a';
        //System.out.println(myChar + letter); //this will add the ascii values together
        if(myChar >= 'a' && myChar <= 'z') {
            System.out.println(myChar + " is a lowercase alpha myCharacter");
        } else if(myChar >= 'A' && myChar <= 'Z') {
            System.out.println(myChar + " is an uppercase alpha myCharacter");
        } else {
            System.out.println(myChar + " is not an alpha myCharacter");
        }

        //using chained ternary to check
        String alpha = (myChar >= 'a' && myChar <= 'z') ? myChar + " is a lowercase alpha myCharacter"
                : (myChar >= 'A' && myChar <= 'Z') ? myChar + " is an uppercase alpha myCharacter"
                : myChar + " is not an alpha myCharacter";
        System.out.println("\nFrom ternary " + alpha);
    }
}
