package com.Simran715.ST2.CommandLine;

public class ArgPrint {
    public static void main(String[] args) {
        if(args.length==0)
        {
            System.out.println("No input provided");
        }
        else{
            for(String arg:args)
            {
                System.out.println(arg);
            }
        }
        System.out.println("Total arguments:"+args.length);
    }
}
