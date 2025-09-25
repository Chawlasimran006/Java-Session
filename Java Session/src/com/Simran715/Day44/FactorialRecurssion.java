package com.Simran715.Day44;

import java.util.Scanner;
public class FactorialRecurssion {

    public static int fact(int n){
        if(n==0|| n==1)
        {
            return n;
        }
        return n*fact(n-1);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int factorial=fact(num);
        System.out.print(factorial);
    }
}
