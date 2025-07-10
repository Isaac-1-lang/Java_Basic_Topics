import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Printing numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        // Finding the sum from 1 to 10 using while loop
        int sum = 0, i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum from 1 to 10 = " + sum);

        // Infinite factorial input loop
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number to find its factorial (-1 to exit): ");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Exiting...");
                break;
            } else if (number < 0) {
                System.out.println("Please enter a non-negative number.");
                continue;
            }

            int factorial = findFactorial(number);
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        scanner.close();
    }

    // Method to find factorial recursively
    public static int findFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * findFactorial(n - 1);
    }
}
