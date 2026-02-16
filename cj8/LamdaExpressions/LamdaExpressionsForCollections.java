package com.techouts.cj8.LamdaExpressions;

import java.util.ArrayList;

class Student{
    String name;
    int marks;
    Student(String n,int m){
        name = n;
        marks=m;
    }
}
public class LamdaExpressionsForCollections {
    public static void main(String[] args) {
        //
        Student obj1=new Student("Suresh", 78);
        Student obj2=new Student("Ramesh", 74);
        Student obj3=new Student("Gopi", 70);
        ArrayList<Student> arr=new ArrayList<>();
        arr.add(obj1);
        arr.add(obj2);
        arr.add(obj3);
        System.out.println(arr.size());

        arr.sort((Student o1, Student o2) ->{
                return o1.marks-o2.marks;
        });
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).marks);
        }


    }// u can also use this lamda expressios in collections aswell
}
