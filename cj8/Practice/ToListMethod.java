package com.techouts.cj8.Practice;

import java.util.*;
import java.util.stream.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;


public class ToListMethod {
    public static void main(String[] args) {

        int arr[]={12,1,14,45};
        ArrayList<ArrayList<Integer>> temp=new ArrayList<>();
        temp.add(new ArrayList<>());
        temp.add(new ArrayList<>());
        temp.add(new ArrayList<>());
        temp.get(0).add(10);
        temp.get(0).add(20);
        temp.get(1).add(10);
        temp.get(2).add(10);








        Set<Integer> set = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> array1=new ArrayList<>();

        array1.add(10);
        array1.add(20);
        array1.add(30);
        array1.add(40);

        Map<Integer,String> list =
                array1.stream()
                        .collect(Collectors.toMap(
                                n->(n%2==0?1:0),
                                n->"Value"+n,
                                (v1,v2)->v1
                        ));

        Map<Integer, TreeMap<String,Integer>> map = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.toMap(
                        w->w.length(),                 // keyMapper
                        w -> {
                            TreeMap<String,Integer> l1 = new TreeMap<>();
                            l1.put(w,1);
                            return l1;
                        }, // valueMapper
                        (list1, list2) -> {              // mergeFunction
                            list1.putAll(list2);
                            return list1;
                        }
                ));

        Stream<String> words = Stream.of("apple", "bat", "banana", "cat");

        TreeSet<String> treeSet = words.collect(
                Collector.of(
                        TreeSet::new,                       // supplier
                        (set1, word) -> set1.add(word.toUpperCase()), // accumulator
                        (set1, set2) -> {                   // combiner
                            set1.addAll(set2);
                            return set1;
                        }
                )
        );


        System.out.println(treeSet);


        System.out.println(map);

        for(int e:list.keySet()){
            System.out.println(e);
        }







    }
}
