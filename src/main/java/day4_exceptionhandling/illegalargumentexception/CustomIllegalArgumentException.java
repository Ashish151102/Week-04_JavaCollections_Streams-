package day4_exceptionhandling.illegalargumentexception;

public class CustomIllegalArgumentException extends Exception{
    public CustomIllegalArgumentException(String message) {
        super(message);
    }
}
