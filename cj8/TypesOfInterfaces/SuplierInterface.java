package com.techouts.cj8.TypesOfInterfaces;
import java.util.*;
import java.util.function.Supplier;

public class SuplierInterface {
    public static void main(String[] args) {
        Supplier<String> helloSupplier = () -> "Hello, World!"; // it takes 0 input

        // Call get() to get the value
        String message = helloSupplier.get();
        System.out.println(message); // Output: Hello, World!
    }
}
