package Set_Interface;

public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<Integer> set=new java.util.LinkedHashSet<>();

        set.add(200);
        set.add(100);
        set.add(300);
        set.add(400);

        System.out.println(set);

        System.out.println(set.contains(400));
        System.out.println(set.remove(400));
    }
}
