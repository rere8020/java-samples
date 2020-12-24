package com.syntax.program;

import java.io.IOException;

public class DetermineOS {
    public static void main(String[] args) throws IOException {

        String strOSName = System.getProperty("os.name");

        System.out.print("Display the current OS name example.. OS is ");
        if(strOSName != null)
        {
            if(strOSName.toLowerCase().contains("linux"))
                System.out.println("Linux");
            else
                System.out.print("not Linux");
        }
        System.out.println(System.getenv("PATH"));
        System.out.println(System.getProperty("os.arch"));

        ProcessBuilder builder = new ProcessBuilder();
        Process process = Runtime.getRuntime().exec("ping www.stackabuse.com");

    }

}
