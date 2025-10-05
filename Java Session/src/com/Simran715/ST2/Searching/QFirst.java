package com.Simran715.ST2.Searching;


public class QFirst {
    public static int searchInsert(int [] arr, int target)
    {
        int low=0; int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;

        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        System.out.println(searchInsert(arr, 5));

    }
}
