package Exams.intensives;

import java.util.HashMap;
import java.util.Map;

interface Animal {
    String makeSound();
}



class Cat implements Animal {
    public String makeSound() {
        return "Meow!!!!!";
    }
}


class Dog implements Animal {
    public String makeSound() {
        return "Wooooww!!!!!";
    }
}

class SoundPrinter<T extends Animal> {
    public void print(T t) {
        System.out.println(t.makeSound());
    }
}
public class Main {
    public static void main(String[] args) {
        SoundPrinter<Dog> sp1 = new SoundPrinter<>();
        SoundPrinter<Cat> sp2 = new SoundPrinter<>();
        Dog d1 = new Dog();
        Cat c1 = new Cat();


        sp1.print(d1);
        sp2.print(c1);


        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"Dog");
        map.put(1,"Cat");
        for(Map.Entry<Integer,String> entry:map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
