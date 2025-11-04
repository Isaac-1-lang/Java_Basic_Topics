package catPrep;

public class Overly {
}


abstract class Animal1 {
    abstract void makeSound(); // must be implemented in subclass

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog1 extends Animal1 {
    void makeSound() {
        System.out.println("Woof Woof!");
    }
}

