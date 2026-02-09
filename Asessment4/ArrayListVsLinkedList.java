package com.techouts.Asessment4;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        // so in arraylist is dynamic dype , we can keep on adding elements
        //in to it , where as in linkedlist also we can add elements dynamically

        //difference
        //ArrayList :
        // i.we can access any element in the array , because arraylist has
        // indices , so in O(1) we can access the elements
        //
         //ii.in insertions also arraylist will do it in O(1)

        //LinkedList :
        // i.we dont have a indices in linked list , because
        // here we link the nodes based on the previous nodes (address)

        // so to find the element it might take O(n)

        //ii. so for insertions it is easily done in O(1)




        // so arraylist is better in a. insertions b. access


        ArrayList<Integer> arr=new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();

        arr.add(10);
        arr.add(20);


        linkedList.add(10);
        linkedList.add(20);


        arr.get(0);
        int requiredElement = 1;
        int cnt=0;

        System.out.println(linkedList.contains(100));


    }
}
