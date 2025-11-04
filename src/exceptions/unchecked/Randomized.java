package exceptions.unchecked;

import java.util.ArrayList;
import java.util.Random;

public class Randomized {
    public static void main(String[] args) {
        Random r = new Random();
        int c = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1200; i++) {
            int a = r.nextInt();
            int b = r.nextInt();

            try {
                c = a / b;
                list.add(c);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero, skipping...");
                c=0;
            }
        }

        System.out.println("Done! " + list.size() + " valid divisions stored.");
    }
}
