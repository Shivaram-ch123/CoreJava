package PrintExceptionInfo;

public class PrintStackTrace {
    public static void main(String[] args) {
        /*
        PrintStackTrace :
            Every exception in Java (all subclasses of Throwable) has a printStackTrace() method.
            It prints all details about the exception, so you know:
            Type of exception (ArithmeticException, ArrayIndexOutOfBoundsException, etc.)
            Error message (like / by zero)
            Where it happened in your code (class, method, line number)
            Call sequence – which methods called which, until the error happened
        */

        try {
            int[] arr = new int[2];
            arr[5] = 10;  // Out of bounds!
        } catch (Throwable e) {
            e.printStackTrace();  // prints full exception details
        }


        //2. initCause


    }
}
