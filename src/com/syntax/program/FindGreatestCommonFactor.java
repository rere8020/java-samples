package com.syntax.program;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FindGreatestCommonFactor {

    public static void main(String[] args) {
        int n1 = 120, n2 = 60, gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD for " + n1 + " and " + n2 + " is " + gcd);

        System.out.println("\nusing a while loop");
        int num1 = 81, num2 = -153;

        // Always set to positive
        num1 = ( num1 > 0) ? num1 : -num1;
        num2 = ( num2 > 0) ? num2 : -num2;

        while(num1 != num2)
        {
            if(num1 > num2)
                num1 -= num2;
            else
                num2 = num2 - num1;
                //num2 -= num1;
        }

        System.out.println("G.C.D = " + num1);

    }
}
