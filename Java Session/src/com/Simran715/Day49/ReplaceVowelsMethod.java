package com.Simran715.Day49;
import java.util.Scanner;

public class ReplaceVowelsMethod {

    public static String replaceVowels(String input){
        return input.replaceAll("[aeiouAEIOU]","*");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();

        String modified=replaceVowels(name);
        System.out.println("Orignal: "+name);
        System.out.println("Modified: "+modified);
    }

}
