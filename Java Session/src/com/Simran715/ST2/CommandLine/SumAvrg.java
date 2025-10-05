package com.Simran715.ST2.CommandLine;

public class SumAvrg {
    public static void main(String[] args) {
        double sum=0;
        int count=0;
        for(String arg: args){
            try {
                double num = Double.parseDouble(arg);
                sum += num;
                count++;
            }
            catch(NumberFormatException e){

            }
        }
        if(count>0)
        {
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + (sum / count));
        }
        else {
            System.out.println("No numeric arguments");
        }
    }
}
