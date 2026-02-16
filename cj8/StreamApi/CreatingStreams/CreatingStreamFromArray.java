package com.techouts.cj8.StreamApi.CreatingStreams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamFromArray {
    public static void main(String[] args) {
        // create strams from a array
        int arr[]={12,234,65,24,66};
        Stream<Integer> stream = Arrays.stream(arr).boxed();

    }
}
