package org.techouts;

final class Temp5{
    int x,y;
    void fun(){
        System.out.println("hello");
    }
}

class MethodExample2{
     final void fun7(){
         System.out.println("hello from final method");
    }
}

class MethodExample1 extends MethodExample2{
    // from here we cannot change that function
}
public class FinalKeyWord {
    public static void main(String[] args) {
        //final keyword is used to give for the methods variables or classes ,for different use
        //1. final class -> we cannot extend that anymore

        //2.final variable
        final int x=100;
        //we cannot change this further

        //3., for method we cannot override that

    }
}
