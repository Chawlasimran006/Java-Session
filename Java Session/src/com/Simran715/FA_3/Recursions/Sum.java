package com.Simran715.FA_3.Recursions;
import java.util.Scanner;
public class Sum {
    static int sum(int n)
    {
        if(n==0)
            return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        System.out.print("Sum: "+ sum(n));
    }
}
