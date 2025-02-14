package day4_exceptionhandling.ioexception;

import java.io.IOException;

public class CustomIOException extends Exception {
    public CustomIOException(String message) {
        super(message);
    }
}
