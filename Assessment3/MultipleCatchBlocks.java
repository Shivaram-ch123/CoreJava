import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        try{
            int element = arr[7];
            System.out.println(element);
        }catch (ArithmeticException exception1){
            System.out.println(exception1);
        }catch (ArrayIndexOutOfBoundsException exception2){
            System.out.println(exception2);
        }
        finally {
            System.out.println("Successfully completed the code without any crash");
        }
    }
}
