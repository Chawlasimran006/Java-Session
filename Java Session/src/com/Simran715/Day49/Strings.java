package com.Simran715.Day49;

public class Strings {
//    public static void main(String[] args) {
//        String str="Hello World";
//        String str2=new String("Hello World");
//        System.out.println(str==str2);
//        System.out.println(str.equals(str2));
//    }


        public static void main(String[] args) {

            String original = "Hello";

            char[] charArray = original.toCharArray();

            charArray[0] = 'J';

            System.out.println("Modified char array: " + new String(charArray));

            System.out.println("Original string: " + original);
        }
    }

