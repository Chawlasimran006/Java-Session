package com.Simran715.ST2.CommandLine;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        if(args.length==0)
        {
            System.out.println("No arguments provided");
            return;
        }
        try{
            int num=Integer.parseInt(args[0]);
            for(int i=1;i<=10;i++)
            {
                System.out.println(num +" x "+i+" = "+ (num*i));
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid");
        }

    }
}
