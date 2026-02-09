package com.techouts.Asessment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");

        Map<String ,Integer> ans=new HashMap<>();
        for(int i=0;i<list.size();i++){
            ans.put(list.get(i),list.get(i).length());
        }
        

    }
}
