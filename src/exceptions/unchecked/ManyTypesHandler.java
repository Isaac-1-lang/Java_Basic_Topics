package exceptions.unchecked;

import java.util.ArrayList;

public class ManyTypesHandler {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add(42);
        System.out.println(list);
    }
}
