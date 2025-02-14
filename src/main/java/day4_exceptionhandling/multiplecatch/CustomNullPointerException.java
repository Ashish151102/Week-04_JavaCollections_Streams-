package day4_exceptionhandling.multiplecatch;

public class CustomNullPointerException extends NullPointerException{
    public CustomNullPointerException(String message) {
        super(message);
    }
}

