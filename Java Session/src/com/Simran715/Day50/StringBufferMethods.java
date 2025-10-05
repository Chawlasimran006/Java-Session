package com.Simran715.Day50;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Java");

        System.out.println(str.append(" Program"));
        System.out.println(str.insert(0,"My "));
        str.setCharAt(0,'A');
        System.out.println(str);
        System.out.println(str.delete(1,3));
        System.out.println(str.reverse());


    }
}
