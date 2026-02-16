package com.techouts.cj8.LamdaExpressions.Variable_Capturing;
class MyClass1{
    static int variable =20; // objects variable
    void method(){
        Runnable r=()->{
            System.out.println("hello "+variable);
        };
        r.run();
        variable=200;
        r.run();

    }
}
public class StaticVariable {
    public static void main(String[] args) {
        MyClass1 myClass1=new MyClass1();
        myClass1.method();
        Integer t1=100;


    }
}
