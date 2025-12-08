package Exams.intensives;

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


    }
}
