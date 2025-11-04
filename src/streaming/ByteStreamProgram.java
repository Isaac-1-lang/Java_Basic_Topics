package streaming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamProgram {
    public static void main(String[] args) throws  IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
   /*
   *Whatever might happen we have to close  any file not omly when ut is null
   *
   *
   *
   *
   *
    */
        try {
            // Open the input and output files
            fis = new FileInputStream("index.txt");
            fos = new FileOutputStream("output.txt");

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
