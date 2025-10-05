package com.Simran715.ST2.CommandLine;

public class Input {
    public static void main(String[] args) {
        if(args.length>=2) {
            try {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                System.out.println("Sum: " + (a + b));
            } catch(NumberFormatException e){
                System.out.println("Invalid(You entered string");
            }
        }
        else{
            System.out.println("Please provide two numbers as command line arguments.");

        }

    }
}
