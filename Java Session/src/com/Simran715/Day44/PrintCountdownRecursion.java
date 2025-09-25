package com.Simran715.Day44;
import java.util.Scanner;

public class PrintCountdownRecursion {
    public static int Countdown(int n)
    {
        if(n==0)
            return n;
        System.out.print(n);
        return Countdown(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();
    
            System.out.print(Countdown(num)+ " ");


    }
}
