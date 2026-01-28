package org.techouts;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking two numbers as input
        int number1 = sc.nextInt();
        int number2=sc.nextInt();
        System.out.println("Enter the type of operation that you want to do");
        char operation = sc.next().charAt(0);

        switch (operation){
            case '+':{
                int calculation = number1+number2;
                System.out.println("Final ans : "+calculation);
                break;
            }
            case '-':{
                int calculation = number1-number2;
                System.out.println("Final ans : "+calculation);
                break;
            }
            case '*':{
                int calculation = number1*number2;
                System.out.println("Final ans : "+calculation);
                break;
            }
            case '/':{
                if(number2==0){
                    System.out.println("number2 cannot be zero");
                    break;
                }
                int calculation = number1/number2;
                System.out.println("Final ans : "+calculation);
            }
            default:{
                System.out.println("Your output is printed!!");
            }
        }
    }
}
