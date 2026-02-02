package list_interface;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        System.out.println(list);
        System.out.println(list.get(0));
        list.set(0,100);
        list.remove(0);
        System.out.println(list.size());

    }

}

//add()	Adds an element to the end of the list
//get()	Returns the element at the specified position
//set()	Replaces the element at the specified position
//remove()	Removes the element at the specified position
//size()	Returns the number of elements in the list