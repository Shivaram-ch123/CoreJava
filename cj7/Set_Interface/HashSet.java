package Set_Interface;

import java.util.Scanner;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> hset = new java.util.HashSet<>();
        //add(), contains(), and remove()

        hset.add(200);
        System.out.println(hset.contains(200));

    }
}
