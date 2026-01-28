package org.techouts;

class Parent{
     Parent(){
        System.out.println("This is a normal constructor");
    }
    Parent(String name,String city){
        System.out.println("This is a parameterized constructor");
        System.out.println("Iam from : "+city+" my name is : "+name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        //creating a object for the Parent class
        Parent parent = new Parent("shivaram","khammam");
    }
}
