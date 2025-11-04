package exceptions.self;

public class ThrowsDemo {
    public void demo(int n) throws NullPointerException, ArithmeticException,ArrayIndexOutOfBoundsException {
        if(n>18)  throw new ArrayIndexOutOfBoundsException();
        System.out.println("The number is "+n);
    }

    // if the function throws an exception we have to put try-catch block in main function!!!!!
    public static void main(String[] args) {


        try {
            ThrowsDemo demo = new ThrowsDemo();
            demo.demo(20);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught inside demo");
        }
    }
}
