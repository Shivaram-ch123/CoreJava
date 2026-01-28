package org.techouts;

import java.util.Scanner;

public class CheckingPositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//we are taking the input
        int number = sc.nextInt();

        if(number>0) System.out.println("It is a Positive Number");
        else if(number<0) System.out.println("It is a Negative Numbeer");
        else System.out.println("It is Zero");
    }
}
