package com.Simran715.Day42;
import java.util.Scanner;
public class SumOfEachColumn {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter number of rows: ");
        int rows= sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols= sc.nextInt();

        int [][] matrix= new int [rows][cols];

        System.out.print("Enter elements of matrix: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<cols;i++)
        {
            int sum=0;
            for(int j=0;j<rows;j++)
            {
                sum+=matrix[j][i];
            }
            System.out.println("Sum of "+(i+1)+" column is: "+sum);
        }

    }
}
