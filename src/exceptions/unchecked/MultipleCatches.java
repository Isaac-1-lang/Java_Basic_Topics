package exceptions.unchecked;

import java.util.ArrayList;

public class MultipleCatches {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(0);
        list.add(7);
        list.add(8);
        list.add(9);
        for(int i=0;i<20;i++) {
            try {
                System.out.println(20/list.get(i));
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero, skipping...");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Element access unavailable, skipping...");
            }
        }
    }

}
