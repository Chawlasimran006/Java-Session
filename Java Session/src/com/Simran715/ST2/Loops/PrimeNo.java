package com.Simran715.ST2.Loops;
import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        //To check Prime
//        boolean isPrime=true;
//        if(n<=1){
//            isPrime=false;
//        }
//        for(int i=2;i<=Math.sqrt(n);i++)
//        {
//            if(n%i==0)
//            {   isPrime=false;
//                break;
//            }
//        }
//        if(isPrime)
//            System.out.println("Yes");
//        else
//            System.out.println("No");



        //To write prime numbers in range
        for(int i=2;i<=n;i++)
        {
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i+ " ");
        }
    }
}
