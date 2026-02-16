package com.techouts.cj8.MethodReference.TypesOfMethodReferences;
class Class1{
     void method1(){
        System.out.println("hello all how are you");
    }
}
public class InstanceMethodReference {
    public static void main(String[] args) {
        //you need to create the object for the instance methods

        Class1 class1=new Class1();
        Runnable r1=class1::method1;
    }

}

