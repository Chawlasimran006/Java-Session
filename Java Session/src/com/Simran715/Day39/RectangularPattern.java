package com.Simran715.Day39;
//Question: Display a rectangular pattern of stars where the number of rows and columns is read from the user (using nested loops and conditionals)
import java.util.Scanner;

public class RectangularPattern {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            int rows= sc.nextInt();

            System.out.print("Enter number of columns: ");
            int column=sc.nextInt();

            for(int i=0;i<rows;i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            sc.close();
    }
}
