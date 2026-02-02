package Exceptions;

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}
public class UserDefinedExceptions {
    public static void main(String[] args) throws AgeException {
        if(10>11){
            throw new AgeException("This is wrong");
        }
        Exception t = new Exception("Some problem happened");
        t.getMessage();

    }
}
//1. user defined exceptions

/*
    Object → Throwable

    Think of Throwable as the root of all problems in your program.
    Everything that can “go wrong” (errors and exceptions) comes from Throwable.
 */