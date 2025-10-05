package com.Simran715.ST2.Loops;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        int temp=n;
        int count=0;
//        int count=String.valueOf(n).length();
        while(temp>0)
        {
            temp=temp/10;
            count++;

        }
        temp=n;
        while(temp>0)
        {
            int a=temp%10;
            sum+=Math.pow(a,count);
            temp/=10;
        }
        if(sum==n)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
