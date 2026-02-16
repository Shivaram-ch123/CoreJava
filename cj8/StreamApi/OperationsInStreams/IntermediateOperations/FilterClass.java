package com.techouts.cj8.StreamApi.OperationsInStreams.IntermediateOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class FilterClass {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        String s="Shivaram";
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }

        // filter -> predicate -> stream
        // map    -> function  -> stream
        // flatMap -> function -> stream
        List<String> words = Arrays.asList("Hello", "World");



    }
}
