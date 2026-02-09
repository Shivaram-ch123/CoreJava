package com.techouts.Asessment4;

import java.util.ArrayList;
import java.util.List;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);

        for(int i=0;i<list1.size();i++){
            if(list1.get(i)%2==0){
                int ele = list1.get(i);
                ans.add(ele*ele);
            }
        }
        System.out.println(ans);


    }
}
