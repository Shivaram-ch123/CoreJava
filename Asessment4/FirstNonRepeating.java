package com.techouts.Asessment4;

import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,1,4,5};

        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                int val = hmap.get(i)+1;
                hmap.put(arr[i] , val);
            }
            else hmap.put(arr[i],1);
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(hmap.get(i)>1)continue;
            System.out.println(arr[i]);
            ans=1;
            break;
        }
        if(ans==0){
            System.out.println("-1");
        }

    }
}
