package com.Simran715.ST2.Arrays;
import java.util.Arrays;
public class SecondSmallest {
    public static void main(String[] args) {
        int [] arr={1,1,3,4,5};

        //Second Smallest

//        int first_min=Integer.MAX_VALUE;
//        int second_min=Integer.MAX_VALUE;
//
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]<first_min)
//            {
//                second_min=first_min;
//                first_min=arr[i];
//            }
//            else if(arr[i]<second_min && arr[i]!=first_min)
//            {
//                second_min=arr[i];
//            }
//        }
//        System.out.println(first_min);
//        System.out.print(second_min);



        // Second Largest

        int first_max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first_max)
            {
                second_max=first_max;
                first_max=arr[i];
            }
            else if(arr[i]>second_max && arr[i]!=first_max)
            {
                second_max=arr[i];
            }
        }
        System.out.println(first_max);
        System.out.print(second_max);

    }
}
