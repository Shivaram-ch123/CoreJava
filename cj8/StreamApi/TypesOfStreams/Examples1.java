package com.techouts.cj8.StreamApi.TypesOfStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Examples1 {
    public static void main(String[] args) {
        //1. sequential streams - > process the data in order
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        Stream<Integer> stream = arr.stream();


        //2. parallel streams
        stream.parallel().forEach(element-> System.out.println(Thread.currentThread().getId() +" hello "));

        //3.Infinite Stream
        Stream.iterate(1,n->n*2).limit(5).forEach(System.out::println);

        //4.premitive types
        //instead of stream directly we use IntStream ,CharStream --> directly so it will be more
        // efficient
    }
}
