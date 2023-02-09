package MiscJava.DataStructures.Exceptions;

public class OverflowException extends Exception {

    public OverflowException(String exceptionString) {
        System.err.println(exceptionString);
    }
}
