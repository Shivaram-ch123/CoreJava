package Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class set_interface {
    public static void main(String[] args) {
        //child classes
        //HashSet - fast and unordered
        //TreeSet - sorted set
        //LinkedHashSet - ordered by insertion

        Set<Integer> set=new HashSet<>();
        set.add(20);
        set.add(40);
        set.remove(20);
        System.out.println(set);

    }
}

//Method	Description
//add()	Adds an element if it's not already in the set
//remove()	Removes the element from the set
//contains()	Checks if the set contains the element
//size()	Returns the number of elements
//clear()	Removes all elements
