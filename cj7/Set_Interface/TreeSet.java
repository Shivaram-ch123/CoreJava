package Set_Interface;

public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> tset=new java.util.TreeSet<>();
        tset.add(300);
        tset.add(500);

        System.out.println(tset.contains(500));
        System.out.println(tset.remove(300));
    }
}
