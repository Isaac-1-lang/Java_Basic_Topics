package exceptions.customs;

public class NegativeNumberException extends RuntimeException{
    public NegativeNumberException(String message) {
        super(message);
    }
}


class Main {
    static void checkNumberSign(int number)  throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative number are not allowed");
        } else {
            System.out.println("This is number is allowed");
        }
    }
    public static void main(String[] args) {
        try {
            checkNumberSign(10);
            checkNumberSign(-12);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}