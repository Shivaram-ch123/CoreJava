package com.techouts.cj8.LamdaExpressions.Variable_Capturing;
class MyClass2{

    void method(){
        int variable =20;
        Runnable r=()->{
            System.out.println("hello "+variable);
        };
        r.run();
        // variable=200; you cannot change it because these variables are stored inside the stack ( methods variables )
        r.run();

    }
}
public class LocalVariables {
    public static void main(String[] args) {
        MyClass2 myClass2=new MyClass2();
        myClass2.method();
    }
}
