package day4_exceptionhandling.ioexception;

public class Main {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\ashish kumar\\OneDrive\\Desktop\\Eassy\\Global Warming.txt";

        ReadFile reader = new ReadFile();
        try{
            reader.readFile(filepath);
        } catch (CustomIOException e) {
            System.out.println(e.getMessage());
        }
    }
}

