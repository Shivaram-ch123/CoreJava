package MapInterface;

public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<String, String> capitalCities = new java.util.TreeMap<>(); // stores unique keys , and in sorted order

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
    }
}
