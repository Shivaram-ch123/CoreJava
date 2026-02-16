package com.techouts.cj8.Practice;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        String temp="hello how are you";

        String ans=Arrays.stream(temp.split(" "))
                .reduce("",(w1,w2)->w1.length()>w2.length()?w1:w2);
        System.out.println(ans.length());

    }
}
