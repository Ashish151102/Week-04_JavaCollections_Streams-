package Day3_JavaStreams.tolowercase;

import javax.swing.*;
import java.io.*;

public class ToLowerCase {
    public static void toLowerCase(String source, String destination){
        BufferedReader bufferedReader;
        BufferedWriter  bufferedWriter;

        try{
            bufferedReader = new BufferedReader(new FileReader(source));
            bufferedWriter = new BufferedWriter(new FileWriter(destination));

            String line;

            while((line = bufferedReader.readLine()) != null){
                String lowerCaseLine = line.toLowerCase();
                bufferedWriter.write(lowerCaseLine);
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File written successfully !!");
    }

    public static void main(String[] args) {
        String source = "D:\\File\\Global Warming .txt";
        String destination = "D:\\File.txt";

        toLowerCase(source, destination);
    }
}
