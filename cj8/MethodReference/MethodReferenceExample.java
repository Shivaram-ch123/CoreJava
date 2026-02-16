package com.techouts.cj8.MethodReference;
import java.util.function.Consumer;  // getting the consumer interface

class Temp{
    void method(){
        System.out.println("helloo");
    }
}
public class MethodReferenceExample {
    public static void main(String[] args) {
        // in this right hand side we always writing a function right , so can we directly assign a function yes we can do by the below syntax

//        Runnable r = () -> sayHello(); // using lambda
//        r.run();

        Temp t1=new Temp();

        Runnable r=t1::method;


    }
}
