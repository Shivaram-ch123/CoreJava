package com.techouts.cj8.LamdaExpressions;

class HelloWorld{
    static int a=200;

    void display(){
        a+=1;
        Runnable r=()->{
            System.out.println(a);
        };
        r.run();
    }
}
public class StaticVariables {
    public static void main(String[] args) {
        HelloWorld h=new HelloWorld();
        h.display();
    }
}
