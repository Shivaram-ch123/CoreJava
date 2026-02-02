package PrintExceptionInfo;

public class GetMessage {
    public static void main(String[] args) {
        try {
            divide(2, 0); // ❌ Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Message String = " + e.getMessage());
        }

    }
    public static void divide(int a, int b) {
        int c = a / b;
        System.out.println("Result:" + c);
    }
}
//👉 getMessage() → returns only the error message
//👉 toString() → returns exception type + error message
