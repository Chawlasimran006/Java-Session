package com.Simran715.Day42;

import java.util.Scanner;

public class PrintElementsOf_TwoDArray {

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

            System.out.println("Displaying Elements");
            for (int i = 0; i < rows; i++) {
                for(int j=0;j<cols;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            sc.close();
        }
    }


