package collections.Main;

import java.util.*;

public class Example {

    public static void main(String[] args) {
// It is a kind of set which is able to store elements in a sorted array.
       TreeSet<Integer> trials =  new TreeSet<>();
       trials.add(2);
       trials.add(1);
       trials.add(4);
       trials.add(7);
       for (Integer i : trials) {
           System.out.println(i);
       }
        ArrayList<String> lists = new ArrayList<>();
        lists.add("Hello");
        lists.add("World");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("World");


        for(String s: lists){
            System.out.println(s);
        }


        Set set = new HashSet();
        set.add("Hello");
        set.add("World");
        System.out.println(set);

    }
}
