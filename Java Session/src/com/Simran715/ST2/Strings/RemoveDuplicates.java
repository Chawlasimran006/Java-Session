package com.Simran715.ST2.Strings;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="ABABACBHUIO";
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(char c: s.toCharArray())
        {
            set.add(c);
        }
        StringBuilder sb=new StringBuilder();
        for(char c: set)
        {
            sb.append(c);
        }
        System.out.println(sb.toString());

    }
}
