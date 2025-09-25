package com.Simran715.Day45;
import java.util.Scanner;

public class Linear_Searching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int [] arr={1,2,3,4,5,6,7};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("The number "+num+" is found on index "+i);
                System.out.print("The number "+num+" is found on position "+(i+1));
            }
        }
    }
}
