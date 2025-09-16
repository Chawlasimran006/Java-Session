package com.Simran715.Day42;
import java.util.Scanner;
public class PrintFirst_LastRow {
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

        System.out.println("Displaying Elements of First Row:");
        for(int j=0;j<cols;j++)
        {
            System.out.print(matrix[0][j]+" ");
        }
        System.out.println();

        System.out.println("Displaying Elements of Last Row:");
        for(int j=0;j<cols;j++)
        {
            System.out.print(matrix[rows-1][j]+" ");
        }


        sc.close();
    }
}
