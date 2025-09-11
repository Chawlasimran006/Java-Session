package com.Simran715.Day37;

//Write Java code that demonstrates use of all arithmetic operators (+, -, *, /, %)
//on two variables and explain the output.

public class ArithmeticOperators {
    public static void main(String [] args){
        int a=2,b=3;

        int sum= a+b;
        System.out.println("Sum = " + sum);

        int sub= a-b;
        System.out.println("difference = " + sub);

        int mul= a*b;
        System.out.println("Product = "+ mul);

        int div=a/b;
        System.out.println("Division = "+ div);

        int remainder= a%b;
        System.out.println("Remainder = "+ remainder);
    }

}
