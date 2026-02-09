package com.techouts.Asessment4;

import java.util.ArrayList;

public class SecondHighestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(14);
        arr.add(5);
        arr.add(21);

        arr.stream()
                .sorted((a,b)->{
                    return b-a;
                })
                .skip(1)
                .limit(1)
                .forEach(n-> System.out.println(n));

    }
}
