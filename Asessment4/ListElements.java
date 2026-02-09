package com.techouts.Asessment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(101);
        list1.add(201);
        list1.add(301);
        list1.add(401);

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

        HashMap<Integer,Integer> mapForList2 = new HashMap<>();
        for(int i=0;i<list2.size();i++){
            mapForList2.put(list2.get(i),1);
        }

        for(int i=0;i<list1.size();i++){
            if(mapForList2.containsKey(list1.get(i)))continue;
            System.out.println(list1.get(i));
        }



    }
}
