package exceptions.unchecked;

class ArithmeticException1 {

    int a = 12;
    int b = 0;

    // Method to perform division
    void divide() {
        try {
            int c = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException ejs) {
            System.out.println("Cannot divide by zero! Exception: " + ejs.toString());
        }
    }
    // Modulus also the same
    public static void main(String[] args) {
        ArithmeticException1 obj = new ArithmeticException1();
        obj.divide();
    }
}
