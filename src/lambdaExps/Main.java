package lambdaExps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.sort(Integer::compareTo);
        numbers.forEach(System.out::println);
        numbers.sort((a,b)->a.compareTo(b));
        System.out.println("Even numbers: ");
        numbers.stream().filter(a->a%2==0).forEach(System.out::println);
        numbers.sort(Comparator.reverseOrder());

        System.out.println("Odd numbers:");
        numbers.stream().filter(a->a%2!=0).forEach(System.out::println);
        Calculator calc1 = (x,y)->x*y;
        System.out.println(calc1.compute(1, 2));
        Calculator calc2 = (x,y)->x/y;
        System.out.println(calc2.compute(5, 2));

    }
}
