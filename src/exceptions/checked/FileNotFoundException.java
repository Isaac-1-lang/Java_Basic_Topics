package exceptions.checked;

import java.io.*;

class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        // You can change this filename or take it from args
        String fileName = "ClassNotFoundExample.java";

        // Try-with-resources ensures the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found -> " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
