package com.Simran715.FA_3.Recursions;

public class CountDigits {
    static int countDigits(int n)
    {
        if(n==0)
            return 0;
        return 1+ countDigits(n/10);
    }
    public static void main(String[] args)
    {
        int n=12345;
        System.out.print("Number of digits: "+ countDigits(n));
    }
}
