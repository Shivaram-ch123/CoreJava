package com.techouts.cj8.StreamApi.CreatingStreams;

import java.util.stream.Stream;

public class CreatingStreamUsingStreamOf {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(12,24,56,78,67);
        //if we have fixed values so to create a stram we can use this stream.of method
    }
}
