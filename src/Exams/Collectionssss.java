package Exams;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Collectionssss {
    public static void main(String[] args) {
        HashSet<Integer>  x = new  HashSet<>();
        x.add(2);
        x.add(2);
        x.add(3);
        x.add(1);
        x.add(2);
        x.add(3);
        System.out.println("There "+ x.size()+" elements");
        x.stream().forEach(System.out::println);

        HashMap<Integer, String> x2 = new HashMap<>();
        x2.put(1,"Precieux");
        x2.put(2,"Isaac");
        x2.put(3,"Maladie");
        x2.put(4,"Precieux");
        x2.put(5,"Isaac");
        // Printing each pair
        for(Map.Entry<Integer,String> entries: x2.entrySet()) {
            System.out.println(entries.getKey()+" "+entries.getValue());
        }


        for(Map.Entry<Integer,String> entry: x2.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }



    }
}
