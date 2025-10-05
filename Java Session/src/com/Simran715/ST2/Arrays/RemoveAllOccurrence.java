package com.Simran715.ST2.Arrays;
import java.util.Arrays;
public class RemoveAllOccurrence {

    public static int [] removeAllOccurrence(int [] arr,int value)
    {
        int count=0;
        for(int x:arr)
        {
            if (x!=value)
                count++;
        }
        int[] result=new int[count];
        int indx=0;
        for(int x:arr)
        {
            if(x!=value)
                result[indx++]=x;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,3,4,2,2};
        int [] newArr=removeAllOccurrence(arr,2);
        System.out.println(Arrays.toString(newArr));
    }
}
