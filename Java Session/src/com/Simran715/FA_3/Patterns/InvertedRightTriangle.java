package com.Simran715.FA_3.Patterns;

public class InvertedRightTriangle {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
