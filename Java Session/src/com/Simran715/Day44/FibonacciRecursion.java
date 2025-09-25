package com.Simran715.Day44;

import java.util.Scanner;
public class FibonacciRecursion {

    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
