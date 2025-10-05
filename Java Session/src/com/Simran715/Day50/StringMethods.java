package com.Simran715.Day50;
import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=new String("Hello");

        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.contains("Hello"));
        System.out.println(str.indexOf("H"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace('H','C'));
        System.out.println(str.concat(str2));

    }
}
