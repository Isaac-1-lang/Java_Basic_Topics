import java.util.Scanner;

public class Cont2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum is " + sum);

            System.out.print("Do you want to continue? (yes/no): ");
            sc.nextLine(); // consume leftover newline
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Program ended");

        // Call the Christmas tree function
        printChristmas();

        // Printing the week's day
        System.out.print("Enter the Number of the day: ");
        int dayNumber = sc.nextInt();
        weekDay(dayNumber);

        // Test the sign checker
        System.out.print("Enter a number to check its sign: ");
        int signNumber = sc.nextInt();
        checkTheSign(signNumber);

        // Display sum of even numbers between 1 and 100
        System.out.println("Sum of all even numbers between 1 and 100: " + sumEvenNumbers());

        // Display product of odd numbers between 1 and 20
        System.out.println("Product of all odd numbers between 1 and 20: " + productOddNumbers());

        // Display product of prime numbers between 1 and 100
        System.out.println("Product of all prime numbers between 1 and 100: " + productPrimeNumbers());

        // Swap now
        System.out.println("Input 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Input 2nd number: ");
        int num2 = sc.nextInt();
        swapTwoInputNumbers(num1, num2);
        // Receiving a,b and c coefficients
        System.out.print("Enter a");
        double a =  sc.nextDouble();
        System.out.print("Enter b");
        double b =  sc.nextDouble();
        System.out.print("Enter c");
        double c =  sc.nextDouble();
        QuadraticSolver.quadraticSquares();

        sc.close();
    }

    public static void printChristmas() {
        System.out.println("\nHere's a Christmas tree for you!\n");

        int height = 6;
        for (int i = 1; i <= height; i++) {
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print tree trunk
        for (int i = 0; i < height - 2; i++) {
            System.out.print(" ");
        }
        System.out.println(" |");
    }

    public static void weekDay(int i) {
        switch (i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void checkTheSign(int number) {
        if (number < 0) {
            System.out.println("The number is negative");
        } else if (number == 0) {
            System.out.println("The number is zero");
        } else {
            System.out.println("The number is positive");
        }
    }

    // Sum all even numbers between 1 and 100
    public static int sumEvenNumbers() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        return sum;
    }

    // Product of all odds between 1 and 20
    public static long productOddNumbers() {
        long product = 1;
        for (int i = 1; i <= 20; i += 2) {
            product *= i;
        }
        return product;
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i<=Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Product of all prime numbers between 1 and 100
    public static double productPrimeNumbers() {
        double product = 1.0;
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                product *= i;
            }
        }
        return product;
    }
    public static void swapTwoInputNumbers(int num1,int num2) {
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping 1st Number: " + num1);
        System.out.println("After swapping 2nd Number: " + num2);
    }
    public static void printHypotenusePairs() {
        int count =0;
        for(int a=2;a<100;a++) {
            for(int b=0;b<100;b++) {
                double c= Math.sqrt(a*a+b*b);
                if(c == (int)c) {
                    System.out.println(a+","+b + ", "+(int)c);
                    count++;
                }
            }
        }
        System.out.println("The hypotenuse unique pairs are: " + count);
    }

}



class QuadraticSolver {

    public static void quadraticSquares() {
        Scanner sc = new Scanner(System.in);
        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Calculate discriminants
        double discriminant = b*b - 4*a*c;
        if(discriminant == 0) {
            double x = -b/(2*a);
        } else if(discriminant > 0) {
            double x1=(-b+ Math.sqrt(discriminant))/(2*a);
            double x2=(-b-Math.sqrt(discriminant))/(2*a);
        } else {
            System.out.println("Invalid coefficient");
        }
    }
}