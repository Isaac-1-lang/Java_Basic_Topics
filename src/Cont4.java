import java.util.Scanner;
import java.time.LocalTime;

public class Cont4 {
    public static void main(String[] args) {
        System.out.print("The current time in Kigali.");
        getTimeNow.kigaliTime();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] chars = new char[100];
        int length = 0;

        // Manually copy characters to array and count
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                // Convert to lowercase manually (A-Z to a-z)
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }
                chars[length] = ch;
                length++;
            }
        }

        boolean isPalindrome = true;

        // Compare characters from start and end
        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }
}


class getTimeNow {
    public static void kigaliTime() {
        LocalTime now = LocalTime.now();
        System.out.println("The time is " + now);
    }
}