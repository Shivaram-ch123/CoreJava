package PrintExceptionInfo;

public class ChainedExceptionsExample {

        public static void main(String[] args) {
            ArrayIndexOutOfBoundsException ae = new ArrayIndexOutOfBoundsException();
            Exception ex = new Exception();
            ex.initCause(ae); // Link the first error to this one like this


            try {
                throw ex;
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

        // java shows what is the actual cause of the error



}
