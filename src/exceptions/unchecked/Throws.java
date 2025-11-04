package exceptions.unchecked;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(n);
        Throws j = new Throws();
        j.runs((56));

    }
    public void runs(int n) throws Exception {
        if (n > 20) throw new ArithmeticException();
    }
}
