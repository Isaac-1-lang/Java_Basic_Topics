package exceptions.unchecked;


import java.io.File;
import java.io.FileNotFoundException; // Compile time or checked exceptions
import java.util.Scanner;

class FileCharSearch {
    public static void main(String[] args) {
        try {
            // Outer try: file-level operations
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);
            System.out.println("File opened successfully!");

            // Inner try: line-level operations
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                try {
                    // Try to find a specific character or number
                    if (line.contains("7")) {
                        System.out.println("Found '7' in: " + line);
                    }

                    // Convert string to integer (risky)
                    int number = Integer.parseInt(line.trim());
                    System.out.println("Read number: " + number);

                } catch (NumberFormatException e) {
                    System.out.println("Not a valid number: " + line);
                }
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file could not be found.");
        }
    }
}

class Test {
    static int x=0;

    public static void main(String[] args) {
        System.out.println(x);
    }

}

