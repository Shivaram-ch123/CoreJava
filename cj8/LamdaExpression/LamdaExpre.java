package LamdaExpression;

interface Add{
    void function(int x);
}
public class LamdaExpre {
    public static void main(String[] args) {
        //lamda expression only works for functional interfaces
        int t=10;
        Add a = (int temp) -> {
            System.out.println("HEllo ALL");
        };

        a.function(t);

    }
}
