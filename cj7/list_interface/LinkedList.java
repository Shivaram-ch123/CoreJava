package list_interface;
import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> cars = new java.util.LinkedList<>();

        cars.add("hi");
        cars.add("helo");
        cars.addFirst("first");
        cars.remove(2);
        System.out.println(cars);
    }
}
