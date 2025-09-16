package com.Simran715.Day40;

public class Pattern_Medium {
    public static void main(String[] args) {
        int rows=7;
        for(int i=0;i<rows;i++)
        {
            int num=1;
            for(int j=rows;j>i;j--)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        for(int i=1;i<rows;i++)
        {
            int num=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
