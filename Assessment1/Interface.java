package org.techouts;

interface GrandMother1{
    abstract void function6();
    default void temp0(){
        System.out.println("You are in the grandmother");
    }
}

interface Mother{
    abstract void fun7();
    default void temp1(){
        System.out.println("You are in the mother");
    }
}
class Temperory implements GrandMother1{
    void function6(){
        System.out.println("hi");
    }
    void fun7(){
        System.out.println("hi");
    }
}


public class Interface {
    public static void main(String[] args) {
        //Interface
        /*
        It is a kind of blue print
        if many classes want to follow this then interface is great
        1. we can have only declarations until java 8 , but after that , we
        can able to write the body of the methods using default keyword
        2.
         */
    }
}
