import java.util.Scanner;

class AgeException extends Exception{

    public AgeException(String s) {
        super("Age Exception");
    }
}
public class CustomExceptions {
    public static void main(String[] args) throws AgeException {

        Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();

        if(age < 18 ){
            throw new AgeException("Your age is below 18 years ");
        }
        else {
            System.out.println("You are above 18 years age");
        }
    }
}
