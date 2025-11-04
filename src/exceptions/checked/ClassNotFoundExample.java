package exceptions.checked;

public class ClassNotFoundExample {
    public static void main(String[] args) {
        // Try to load a class that exists
        try {
            // Try to load a class that doesn't exist
            Class.forName("com.example.last");
            Class.forName("java.lang.String");
            System.out.println("String class loaded successfully");


        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }
    }
}
