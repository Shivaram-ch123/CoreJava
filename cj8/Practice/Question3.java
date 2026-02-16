package com.techouts.cj8.Practice;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("First");
        arr.add("all");
        arr.add("are");
        arr.add("goodmorning");

        Map<String,Long> map = arr.stream()
                .collect(Collectors.groupingBy(
                        name->name,
                        Collectors.counting()
                ));
        System.out.println(map);


    }
}
