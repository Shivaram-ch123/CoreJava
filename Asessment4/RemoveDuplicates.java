package com.techouts.Asessment4;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Character> arr=new ArrayList<>();
        arr.add('a');
        arr.add('b');
        arr.add('a');
        arr.add('c');
        arr.add('b');
        //1.
        Set<Character> set=new HashSet<>();
        for(int i=0;i<arr.size();i++){
            set.add(arr.get(i));
        }

        System.out.println(set);



        List<Character> ans = arr.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
