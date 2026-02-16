package com.techouts.cj8.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {
    public static void main(String[] args) {
        String sentence = "I love programming in Java streams";
        int k = 2; // number of vowels we want

        List<String> wordsWithKVowels = Arrays.stream(sentence.split(" "))
                .filter(word -> {
                    word=word.toLowerCase();
                                               // count vowels

                    int cnt =0;
                    for (int i=0;i<word.length();i++){
                        if(word.charAt(i)=='a' ||word.charAt(i)=='e'||word.charAt(i)=='i'
                        || word.charAt(i)=='o'|| word.charAt(i)=='u'){
                            cnt++;
                        }
                    }
                    return cnt == k;                          // only words with k vowels
                })
                .collect(Collectors.toList());

        System.out.println(wordsWithKVowels);

    }
}
