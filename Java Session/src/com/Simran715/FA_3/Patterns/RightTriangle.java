package com.Simran715.FA_3.Patterns;
import java.util.Scanner;
public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
