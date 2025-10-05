package com.Simran715.Day49;

public class ModifyString {
    public static void main(String[] args) {
        String name="Simran";
        char[] arr=name.toCharArray();
        arr[0]='C';
        System.out.println(name);//Original String
        System.out.println(arr);//Modified String
    }
}
