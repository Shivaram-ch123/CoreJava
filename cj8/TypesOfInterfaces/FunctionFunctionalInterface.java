package com.techouts.cj8.TypesOfInterfaces;

import java.util.function.Function;//importing the interface

public class FunctionFunctionalInterface {
    public static void main(String[] args) {
        Function<Integer,String> function= (value)-> "hello";
        //here the Function <input type ,output type>

        System.out.println(function.apply(100));
    }
}
// takes a input and returns something (any type)