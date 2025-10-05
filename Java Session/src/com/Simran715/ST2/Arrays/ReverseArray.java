package com.Simran715.ST2.Arrays;

public class ReverseArray {
    public static void ReverseArray(int []arr, int n){
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4};
        int n= arr.length;

        ReverseArray(arr,n);
        System.out.println("Reversed Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
