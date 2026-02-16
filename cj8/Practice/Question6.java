package com.techouts.cj8.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    int roll;
    String name;
    Student(int r,String n){
        roll=r;
        name=n;
    }
}
public class Question6 {
    public static void main(String[] args) {
        char arr[]={'f','d','f','d','d','f','d'};
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('a');
        list.add('d');

        list.stream()
                .collect(Collectors.groupingBy(
                   c->c,
                   Collectors.counting()
                ));
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student(100,"rahul"));
        list2.add(new Student(101,"bob"));
        list2.add(new Student(102,"krunal"));
        list2.add(new Student(103,"hardik"));
        Map<String, Map<String,Long>> t= list2.stream()
                .collect(Collectors.groupingBy(
                        key->key.name,
                        Collectors.groupingBy(
                                w->"hello",
                                Collectors.counting()
                        )

                ));




    }
}
