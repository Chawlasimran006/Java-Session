package com.Simran715.ST2.Searching;

public class QTwo {
    public static boolean searchMatrix(int[][] matrix, int target)
    {
        int row=0, col=matrix[0].length-1;
        while(row<matrix.length&& col>=0)
        {
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]>target)
            {
                col--;
            }
            else row++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{2,3,4,5},{3,4,5,6}};
        System.out.println(searchMatrix(mat,5));
    }
}
