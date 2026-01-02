package javadocss;


/**
 * Calculator provides basic arithmetic operations.
 *
 * <p>This class is used to demonstrate how JavaDoc works
 * in a real Java project.</p>
 *
 * @author Isaac
 * @version 1.0
 * @since 2025
 */
public class Calculator {

    /**
     * Adds two integers and returns the result.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of {@code a} and {@code b}
     */
    public int calculate(int a, int b) {
        return a + b;
    }

    /**
     * Divides two integers.
     *
     * @param a the numerator
     * @param b the denominator
     * @return result of division
     * @throws IllegalArgumentException if {@code b} is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }
}
