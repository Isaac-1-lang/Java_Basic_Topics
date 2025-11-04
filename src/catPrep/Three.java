package catPrep;



class Animal {
    void speak() { System.out.println("Animal speaks"); }
}

class Dog extends Animal {
//    @Override
//    void speak() { System.out.println("Dog barks"); }
}


public class Three {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();
        String[]  animals = {"Dog","Cat","Fish"};
        for (String animal : animals) {
            System.out.println(animal);
        }
        int n=1;
        switch(n){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}