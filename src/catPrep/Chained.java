package catPrep;

import java.util.ArrayList;
import java.util.Random;

public class Chained extends Exception {
    public Chained(String message) {
        super(message);
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        Random rand = new Random();
        int n=rand.nextInt(100);
        for(int j=0;j<n;j++){
            try {
                System.out.println(a.get(n));
            } catch (ArrayIndexOutOfBoundsException e) {
                try {
                    System.out.println("Can't acces element out of bounds");
                } catch (ArrayIndexOutOfBoundsException ex) {
                    try {
                        throw new Chained("Output");
                    } catch (Chained exception) {
                        throw new RuntimeException(exception);
                    }
                }
            }
        }
    }
}
