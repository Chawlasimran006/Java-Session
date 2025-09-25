package com.Simran715.FA_3.Recursions;

public class GCD {
    static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        int num1=48, num2=18;
        System.out.print(gcd(num1,num2));
    }
}
