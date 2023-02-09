package MiscJava.DataStructures.Exceptions;

public class UnderflowException extends Exception {

    public UnderflowException(String exceptionString) {
        System.err.println(exceptionString);
    }

}
