package com.Simran715.FA_3.Recursions;

//public class Fibonacci {
//    static int fibonacci(int n)
//    {
//        if(n<=1)
//            return n;
//        return fibonacci(n-1)+ fibonacci(n-2);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fibonacci(6));
//    }
//}


//FOR PRINTING FULL SERIES
public class Fibonacci{
    static int fibonacci(int n)
    {
        if(n<=1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        int n=6;
        for(int i=0;i<n;i++)
        {
            System.out.print(fibonacci(i)+ " ");
        }
    }
}
