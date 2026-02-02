package MapInterface;

import java.util.Vector;

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<String,String> capitalCities=new java.util.LinkedHashMap<>(); //order maintained
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
        Vector<String> v = new Vector<>();

    }
}
