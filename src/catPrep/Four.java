package catPrep;

import java.util.*;
interface  Person {
     void printMe();
}
class Student extends Object{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object a) {
        Student s = (Student) a;
        return this.name.equals(s.name) && this.age == s.age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
class Teacher {
    private String name;
    private String course;
    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }
}
public class Four {
    public static void main(String[] args) {
        Student s1 = new  Student("Barsime", 17);
        Student s2 = new  Student("Barsime", 18);
        Student s3 = new  Student("Bless", 16);
        Student s4 = new  Student("Isaac", 16);
        Student s5 = new  Student("Barsime", 18);
        Student s6 = new  Student("Barsime", 18);
        Student s7 = new  Student("Barsime", 18);
        HashSet<Student> set = new HashSet<Student>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        set.add(s7);
        System.out.println(set.size());
//        System.out.println(s1);
    }
}
