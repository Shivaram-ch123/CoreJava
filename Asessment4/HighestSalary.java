package com.techouts.Asessment4;

import java.util.ArrayList;
import java.util.List;

class Student{
    int marks;
    String name;
    Student(int m,String n){
        marks =m;
        name = n;
    }
}
public class HighestSalary {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(75,"rahul"));
        list.add(new Student(98,"bob"));
        list.add(new Student(99,"zebra"));

        list.stream()
                .sorted((a,b)->{
                    return b.marks-a.marks;
                })
                .limit(1)
                .forEach(n-> System.out.println(n.marks));
    }
}
