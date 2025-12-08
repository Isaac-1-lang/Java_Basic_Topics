package mistaken;

import java.util.ArrayList;
import java.util.List;

public class Base {
    void display() {
        System.out.println("Base display");
    }
}

class Derived extends Base {
    @Override
    void display() {
        System.out.println("Derived display");
    }
}

class Main {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.display();
        List<?> names = new ArrayList<String>();
        names.add(null);
        // Lower bound wildcard use
        List<? super Integer> l1 = new ArrayList<Number>();

        l1.add(1);

    }
}
