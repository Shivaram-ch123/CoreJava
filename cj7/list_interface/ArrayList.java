package list_interface;
import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> cars = new java.util.ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println(cars.get(0));
        System.out.println(cars.set(0,"Hello"));
        cars.remove(1);
    }
}
//add(), get(), set(), and remove()