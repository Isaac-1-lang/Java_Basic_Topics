package streaming;

import java.io.*;

public class CharacterStreamProgram {
    public static void main(String[] args) {
        FileReader fis = null;
        FileWriter fos = null;

        try {
            // Open the input and output files
            fis = new FileReader("index.txt");
            fos = new FileWriter("output.txt");

            int c;

            // Read from index.txt and write to output.txt
            while ((c = fis.read()) != -1) {   //  use fis not in, and parentheses properly
                fos.write(c);                   // write the byte directly
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
