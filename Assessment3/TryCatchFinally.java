public class TryCatchFinally {
    public static void main(String[] args) {
        // any thing that might get an execption should needs  to be writen inside this try block and catch blocks

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Always comes here ");
        }

    }
}
