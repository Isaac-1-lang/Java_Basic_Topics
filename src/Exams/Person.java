package Exams;

import java.util.*;

interface Course {
    void course();
}


interface Career {
   void career();
}

class Person {
    private String name;
    private int age;
    public enum Gender { MALE,FEMALE }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("Isaac",12, Gender.MALE);
        Person p2 = new Person("Precieux",14, Gender.MALE);
        Person p3 = new Person("Manzi",15, Gender.MALE);
        Person p4 = new Person("Emmanuel",16, Gender.MALE);
        Person p5 = new Person("Aloys",32, Gender.MALE);
        Person p6 = new Person("Louis",10, Gender.MALE);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        Collections.sort(persons,new AgeComparator());
        Queue<Person> queue = new LinkedList<Person>();
        queue.add(p1);
        queue.add(p2);
        queue.add(p3);
        queue.add(p4);
        queue.add(p5);
        queue.add(p6);
        queue.remove(); // This one is for removing the first element as first in first out in the queue
        while (!queue.isEmpty()) {
            Person p = queue.poll();
            System.out.println(p.name);
        }
        Stack<Person> stack = new Stack<Person>();
        stack.push(p1);
        stack.push(p2);
        stack.push(p3);
        stack.push(p4);
        stack.push(p5);


        stack.push(p6);

        stack.pop(); // This one removes the last element as in the atack Last In First Out.


        persons.stream().filter(person->p1.age>23).forEach(System.out::println);



        for(Person p:persons){
            System.out.println(p.name);
        }

    }
    void printMe() {
        System.out.println("I am a person");
    }


    // constructors
    Person(String s,int a,Gender g) throws InvalidAgeException {
        this.name=s;
        if(a>0) {
            this.age=a;
        } else {
            throw new InvalidAgeException("Invalid age");
        }
        Gender g1=g;
    }
    // getters and Setters
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setAge(int a) throws InvalidAgeException {
        if(a<0) {
            throw new InvalidAgeException("Invalid age plz enter age greater than 0");
        } else {
            this.age = a;
        }
    }
    int getAge() {
        return age;
    }
    void setGender(Gender g) {
        Gender g1=g;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        Person p1 = (Person) o;
        return age == p1.age && name.equals(p1.name);
    }

}


class InvalidAgeException extends  RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge(); // Ascending order
    }   // or p2.getAge - p1.getAge to sort in descending order
}
class Student extends Person implements Course,Career {
    public String school;
    Student(String s, int a, Person.Gender g,String schl) {
        super(s, a, g);
        this.school=schl;
    }

    void printMe() {
        System.out.println("I am a student");
    }
    public void course() {
        System.out.println("I study Physics");
    }
    public void career() {
        System.out.println("I am a student");
    }
}


class Teacher extends Person implements Career,Course {
    String course;
    Teacher(String s, int a, Person.Gender g,String c) {
        super(s, a, g);
        this.course=c;
    }
    public void course() {
        System.out.println("I teach SE");
    }
    public void career() {
        System.out.println("I teach Career");
    }



    void printMe() {
        System.out.println("I am a teacher");
    }
}
