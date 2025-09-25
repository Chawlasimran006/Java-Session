package com.Simran715.FA_3.Patterns;
import java.util.Scanner;
public class PascalsTriangle {
    static void pascal(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            int num=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(num+ " ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        pascal(n);
    }

}
