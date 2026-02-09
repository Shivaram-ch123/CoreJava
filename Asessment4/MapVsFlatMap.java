package com.techouts.Asessment4;

import java.util.ArrayList;
import java.util.List;

public class MapVsFlatMap {
    public static void main(String[] args) {
        //map is used to map the elements , the count of the elements
        //will not decrease , it just changes the vaue

        //flat map is used to make a single stream instead of nested
        // stream

        //1. map

        List<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        arr.stream()
                .map(n->n*n)
                .forEach(n-> System.out.println(n));

        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);

        list.add(list1);
        list.add(list2);

        list.stream()
                .flatMap(array->array.stream())
                .forEach(n-> System.out.println(n));





    }
}
