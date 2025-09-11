package com.Simran715.Day39;
//Create a program using nested loops to print the following pyramid pattern for any N
// (user input), and use if-else conditions to format the spaces and stars

import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
