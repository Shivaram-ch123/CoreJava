package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        //camelCase → variables & methods
        //PascalCase (UpperCamelCase) → class & interface names

        /*
        Exception handling is a way to handle errors that happen while a program is running, so the program doesn’t crash suddenly.

        👉 Without exception handling → program stops
        👉 With exception handling → program handles the error and continues normally
         */

        //1.try–catch Block

        int n=10;
        int m=0;

        try{
            int cal = n/m;
        }
        catch (Throwable e){
            System.out.println("Divided by Zero");
        }
        //2.The finally block always runs
        finally {
            System.out.println("This block always runs");
        }


        //3. Throw
        /*
            throw new ArithmeticException("Invalid input");
            Here:

            throw → keyword
            ArithmeticException → class
            new ArithmeticException() → object of that class

            So you are:
            👉 creating an exception object
            👉 and throwing eit using the throw kyword

            throw throws only one exception
         */

        int age=1;
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
            //4. we are using throw , to make new exceptions
        }
        fun();


        // multiple exceptions
        try {
            int temp=10/0;
            // Code that may throw an exception
        } catch (ArithmeticException e) {
            // Code to handle the exception
        } catch(ArrayIndexOutOfBoundsException e){
            // Code to handle the another exception
        }catch(NumberFormatException e){
            // Code to handle the another exception
        }





        try (BufferedReader br = new BufferedReader(new FileReader("example1.txt"))) {

            String line; // variable to hold each line
            // Step 3: Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print the line
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }


    }
    static int fun() throws ArithmeticException{
        return 6/0;
        //throws :
        //5. If a method uses throws, it does not handle the exception; the caller must handle it using try-catch.

        //If you handle the exception inside the method (using try-catch) → ✅ no throws needed.
        //If you do NOT handle the exception inside the method → ⚠️ the caller must handle it.
        //And yes, in that case, you must write throws in the method declaration.





    }

    //6.Unchecked (RuntimeException, ArithmeticException)	❌ No
    //Checked (Exception, IOException, user-defined checked)	✅ Yes
}
