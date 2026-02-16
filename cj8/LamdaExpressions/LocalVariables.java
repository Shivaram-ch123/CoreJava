package com.techouts.cj8.LamdaExpressions;

public class LocalVariables {
    static void function(){
        int temp=300;

        Runnable r=()->{
            System.out.println(temp);
        };
        //   temp+=1;  here it should be final , wahat evere the vriables that we use it in the lamda fun , it should behave as a final.
        r.run();
    }
    public static void main(String[] args) {
        function();
    }
}
