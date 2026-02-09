package com.techouts.Asessment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class MapSorting {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Hello",10);
        map.put("Hello",20);
        map.put("bob",10);
        map.put("rahul",40);
        map.put("bye",70);
        map.put("good",80);

        TreeMap<Integer, List<String>> list =new TreeMap<>();

        for(String e:map.keySet()){
            int val=map.get(e);
            if(list.containsKey(val)){
                list.get(val).add(e);
            }
            else{
                List<String> internalList = new ArrayList<>();
                list.put(val,internalList);
                list.get(val).add(e);
            }
        }

        for(int e:list.keySet()){

            for(int i=0;i<list.get(e).size();i++){
                System.out.println("key : "+list.get(e).get(i)+" val : "+e);
            }
        }
    }
}
