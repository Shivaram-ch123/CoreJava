package org.techouts;

class School{
    static String schoolname;
    School(){
        schoolname="XYZ High School";
    }
    static void function(){
        System.out.println("We are in static method");
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        // 1. static variable
        // It is a class level variable , it will be same for all the objects
        // if we change this name then it will be changed for every one
        // we can access thsi from using the class name using . operator
        //no need to create object

        System.out.println(School.schoolname);
        School.function();

    }
}
