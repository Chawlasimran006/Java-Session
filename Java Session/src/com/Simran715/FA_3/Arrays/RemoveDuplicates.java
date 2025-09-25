package com.Simran715.FA_3.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        int [] arr= {10,20,20,30,40,40};
        int newsize=1;
        for(int i=1;i<6;i++)
        {
            if(arr[i]!=arr[newsize-1])
            {
                arr[newsize]=arr[i];
                newsize++;
            }
        }
        for(int i=0;i<newsize;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
