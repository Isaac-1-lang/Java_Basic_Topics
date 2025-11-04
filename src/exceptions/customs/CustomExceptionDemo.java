package exceptions.customs;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}


public class CustomExceptionDemo {
    static void checkAge (int age) throws AgeException {
        if (age < 18)
            throw new AgeException("You are under age person");
        else
            System.out.println("Age accepted and access granted");
    }

    public static void main(String[] args) {
        try {
            checkAge(19);
            checkAge(12);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
