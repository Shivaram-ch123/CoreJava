package com.techouts.cj8.TypesOfInterfaces;


import java.util.function.Predicate; // importing predicate interface

public class PredicateFunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (value)-> value==0;

        int temp=10;
        int temp1=0;

        if(predicate.test(temp)) System.out.println("temp is 0");
        if(predicate.test(temp1)) System.out.println("temp1 is 0");
        
    }
}
//It ntakes oe input and returns a boolean (true or false).