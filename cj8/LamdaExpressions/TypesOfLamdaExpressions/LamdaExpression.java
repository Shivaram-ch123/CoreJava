package com.techouts.cj8.LamdaExpressions.TypesOfLamdaExpressions;
interface Method{
    int fun();
}
public class LamdaExpression {
    public static void main(String[] args) {
        Runnable r=()-> System.out.println("Hello"); //void or you can have a return type
        Method ans = ()-> 1;
        System.out.println(ans.fun()); // return type

        //single line written then it is called as a LamdaExpression
    }
}
