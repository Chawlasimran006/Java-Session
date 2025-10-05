package com.Simran715.ST2.Strings;

public class Pallindrome {
    public static void main(String[] args) {
        String s="Madam";
        s=s.toLowerCase();
        String reversed=new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(reversed));
    }
}
