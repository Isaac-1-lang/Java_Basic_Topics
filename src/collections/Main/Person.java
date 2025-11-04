package collections.Main;

import java.util.*;

public class Person implements Comparable<Person> {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return code == person.code && age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", age=" + age +
                '}';
    }
    @Override
    // Using compare
    public int compareTo(Person o) {
        Person person = (Person) o;
        if(this.name.compareTo(person.name) != 0){
            return this.name.compareTo(person.name);
        }
        return Integer.compare(this.age, person.age);




    }
    public Person(String name, int code, int age) {
        this.name = name;
        this.code = code;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int code;
    private int age;
}


class Main1 {
    public static void main(String[] args) {
       Person person = new Person("Isaac", 1, 16);
       Person person1 = new Person("Isaac", 2, 16);
       Person p1 =new  Person("NIYOBYOSE", 6, 16);
       Person p2 =new  Person("Precieux", 4, 15);
       Person p3 =new  Person("Manzi", 2, 56);
       Person p4 =new  Person("Paola", 78, 23);
       Set<Person> set = new TreeSet<>();
       set.add(person);
       set.add(person1);
       set.add(p1);
       set.add(p2);
       set.add(p3);
       set.add(p4);
       System.out.println(set.size());
       set.forEach(s->System.out.println(s));
       List<Person> list = new ArrayList<>();
       list.add(person);
        list.add(person1);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        System.out.println(list.size()+1);
        Collections.sort(list);
        list.forEach(s->System.out.println(s));
        int a=12;
        int b=12;
        if(a==b) {
            System.out.println("They are the same");
        }
    }
}