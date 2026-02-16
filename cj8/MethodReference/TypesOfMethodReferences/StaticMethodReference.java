package com.techouts.cj8.MethodReference.TypesOfMethodReferences;

class Class{
    static void method1(){
        System.out.println("hello all how are you");
    }
}
public class StaticMethodReference {
    public static void main(String[] args) {

        Runnable r1=Class::method1;
        //we can access the static method in a class directly my the class name:method name
    }
}
