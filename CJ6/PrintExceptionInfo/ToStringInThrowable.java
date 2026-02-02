package PrintExceptionInfo;

public class ToStringInThrowable {
    public static void main(String[] args) {

        try {
            int a = 10 / 0; // division by zero
        } catch (Throwable e) {
            java.io.StringWriter sw = new java.io.StringWriter();
            java.io.PrintWriter pw = new java.io.PrintWriter(sw);
            e.printStackTrace(pw); // Save error in string
            System.out.println("Error:\n" + sw.toString());
        }
        //👉 getMessage() → returns only the error message
        //👉 toString() → returns exception type + error message

    }
}

