package com.techouts.cj8.LamdaExpressions.Variable_Capturing;
class MyClass{
    int variable =20; // objects variable
    void method(){
        Runnable r=()->{
            System.out.println("hello "+variable);
        };
        r.run();
        variable=200;
        r.run();

    }
}
public class InstanceVariable {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.method();
    }
}
// here it is objects variable , so it can have the access to get that variable at any time
