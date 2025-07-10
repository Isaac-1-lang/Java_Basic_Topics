import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Cont3 {
    public static void main(String[] args) {
        SortNumbers.sort();
        DescendingSort.Dsort();
    }
}


class SortNumbers {
    public static void sort() {
        Scanner sc = new Scanner(System.in);

        // Enter number count
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Input numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Sort in ascending order
        Arrays.sort(numbers);

        // Display sorted numbers
        System.out.println("Numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
class DescendingSort {
    public static void Dsort() {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        Integer[] numbers = new Integer[n]; // Use Integer not int for Collections.sort

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Sort in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Output
        System.out.println("Numbers in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}


// Checking if palindrome with built-in functions and without them
class PalindromeBuiltIn {
    public static void str() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        // Normalize the string (Lowercase and remove spaces)
        String normalized = input.toLowerCase().replaceAll("\\s+", "").replaceAll("\\W", "");
        String reversed = new StringBuilder(normalized).reverse().toString();

        // Compare using equals()
        if(normalized.equals(reversed)) {
            System.out.println("The string is palindrome");
        } else  {
            System.out.println("The string is not palindrome");
        }
    }
}