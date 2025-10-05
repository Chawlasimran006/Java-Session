package com.Simran715.ST2.Strings;
import java.util.*;
class Person{
    String name;int age;
    Person(String n, int a){
        name=n;
        age=a;
    }
    public String toString(){
        return name+"("+age+")";
    }
}
public class Practice {
    public static void main(String[] args) {
//        String s="Hello";
//        String reversed=new StringBuilder(s).reverse().toString();
//        System.out.println(reversed);


//        String text="Java is fun";
//        StringTokenizer st= new StringTokenizer(text);
//        System.out.println(st.countTokens());

            System.out.println(new Person("Alice",30));

    }

}
