package MapInterface;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String,String> capitalCities=new java.util.HashMap<>();



        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
    }
}
