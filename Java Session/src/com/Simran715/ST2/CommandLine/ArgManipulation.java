package com.Simran715.ST2.CommandLine;

public class ArgManipulation {
    public static void main(String[] args) {
        if(args.length==0)
        {
            System.out.println("No arguments provided");
            return;
        }
        System.out.println("Concatenate: "+String.join(" ",args));

        //Longest Argument
        String longest=args[0];
        for(String arg: args)
        {
            if(arg.length()>longest.length())
            {
                longest=arg;
            }
        }
        System.out.println(longest);

        //Reverse Order
        for(int i=args.length-1;i>=0;i--)
        {
            System.out.println(args[i]);
        }
    }
}
