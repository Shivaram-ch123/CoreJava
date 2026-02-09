package com.techouts.Asessment4;

public class MostFrequentElement {
    public static void main(String[] args) {
        int fre[]=new int[10];
        int arr[]={1,2,3,2,4,2,5};
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            arr[element]++;
        }

        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
