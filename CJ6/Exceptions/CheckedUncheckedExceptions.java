package Exceptions;

public class CheckedUncheckedExceptions {
    public static void main(String[] args) {
        /*
        Checked :
            Checked Exception → compiler forces you to handle it
            Usually external problems outside your control
            Examples:
            Reading a file → FileNotFoundException
            Writing to a database → SQLException
            Network issues → IOException
            Think: “Something can go wrong that I cannot predict fully before running the program.”

        Unchecked :
            Usually programmer mistakes
            Examples:
            Dividing by zero → ArithmeticException
            Null pointer → NullPointerException
            Array out of bounds → ArrayIndexOutOfBoundsException
            Think: “I wrote something wrong in code, so it fails at runtime.”
         */

        int a = 10, b = 0;
        int c = a / b; // Unchecked
        System.out.println(c);
    }
}
