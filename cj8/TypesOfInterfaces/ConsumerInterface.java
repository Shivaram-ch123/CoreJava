package com.techouts.cj8.TypesOfInterfaces;
import java.util.function.Consumer;  // getting the consumer interface
public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (value)-> System.out.println(value);

        consumer.accept(100);


    }
}
// only accept a input and, it will do some thing