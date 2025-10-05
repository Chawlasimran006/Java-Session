package com.Simran715.Day49;

public class Practice {
    public static void main(String[] args) {

        //Simple
        String name="Simran";
        System.out.println(name);

        //Converting charArr to String(Constructor)
        char[] arr={'H','E','L','L','O'};
        String name2=new String(arr);
        System.out.println(name2);

        //Converting String to charArr
        String name3="World";
        char[] arr2=name3.toCharArray();
        for(char c: arr2)
        {
            System.out.print(c+" ");
        }
        System.out.println();

        //Immutability
        String greet="My";
        greet.concat("World");// string is immutable so it doesn't change
        System.out.println(greet);

        greet=greet.concat("World");//this creates a new string in heap
        System.out.println(greet);

    }
}
