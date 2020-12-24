package com.syntax.review7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Variables {
    //instance variable example
    //to use this variable you need to create a class instance
    //Variables vars = new Variables():
    //System.out.println(vars.name);
    //change name
    //vars.name = "NewName";
    String name = "Myname";

    public static void main(String[] args) {

        //local
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
            {
                int a = 10;
                System.out.println(a);
            }
            //can't resolve a because it is inside another block
            //System.out.println(a);
        }

        //instance variable use
        //instance variable can be the same
        String name = "Susan";
        System.out.println(name);

        Variables vars = new Variables();
        System.out.println(vars.name);
    }
}
