package com.Simran715.FA_3.Patterns;

public class RightReverseNo {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int num=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
}
