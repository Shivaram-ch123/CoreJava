package com.techouts.cj8.LamdaExpressions;

interface Add{
    void function();
}
public class LamdaExpre {
    public static void main(String[] args) {
        //lamda expression only works for functional interfaces

        Add a = () -> {
            System.out.println("HEllo ALL");
        };

        a.function();


        //1. lamda with parameters
        //2. single line vs multiline lamda

    }
}
