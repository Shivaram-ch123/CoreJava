package com.techouts.Asessment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);

        Map<Integer,Long> map=list.stream()
                .collect(Collectors.groupingBy(
                        n->n,
                        Collectors.counting()
                ));

        for(int e:map.keySet()){
            if(map.get(e)>1) System.out.println(e);
        }
    }
}
