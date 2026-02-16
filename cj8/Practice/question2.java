package com.techouts.cj8.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class question2 {
    public static void main(String[] args) {
        String temp="dabcadefg";
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<temp.length();i++){
            arr.add(temp.charAt(i));
        }





        List<Character> ans= arr.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(ans);
    }
}
