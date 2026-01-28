package org.techouts;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // taking a string as input
        String str1=sc.next();
        String reversed="";

        int index=str1.length()-1;

        while(index>=0){
            reversed+=str1.charAt(index);
            index--;
        }
        System.out.println("Reversed string : "+reversed);
    }
}
