package com.techouts.cj8.StreamApi.CreatingStreams;

import java.util.*;
import java.util.stream.Stream;

public class CreatingStreamFromCollections {
    public static void main(String[] args) {
        // create a stream from collection:
        List<String> list = Arrays.asList("Java", "Python", "C++");
        Stream<String> stream1 = list.stream(); // stream created from list

    }
}
