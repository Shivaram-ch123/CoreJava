package com.techouts.Asessment4;

import java.util.HashMap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String name="shivaram";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<name.length();i++){
            if(map.containsKey(name.charAt(i))){
                int value=map.get(name.charAt(i))+1;
                map.put(name.charAt(i),value);
            }
            else map.put(name.charAt(i),1);
        }
        for(char e:map.keySet()){
            System.out.println(e+" "+map.get(e));
        }

    }
}
