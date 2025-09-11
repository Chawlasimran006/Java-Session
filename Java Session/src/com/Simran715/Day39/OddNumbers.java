package com.Simran715.Day39;
//Question: Print all odd numbers between 1 and 30 using a for loop and if statement.

public class OddNumbers {
    public static void main (String[]args){
        System.out.println("The number of odd numbers b/w 1 and 30 are:");
        for (int i = 2; i < 30; i++) {
            if (i % 2 != 0) {
                System.out.print(i+ " ");
            }
        }
    }
}
