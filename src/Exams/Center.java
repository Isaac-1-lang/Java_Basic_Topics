package Exams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Center {
    public  static void main(String[] args) {
        // people
        Person p1 = new Person("NIYOBYOSE Isaac",12, Person.Gender.MALE);
        Person p2 = new Person("XYZ",14, Person.Gender.FEMALE);
        Person p3 = new Person("ABC",123, Person.Gender.MALE);
        Person p4 = new Person("DEF",15, Person.Gender.FEMALE);
        Person p5 = new Person("GHI",-2, Person.Gender.MALE);
        // Collection of people
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        Collections.sort(persons,new AgeComparator());
        persons.stream().forEach(System.out::println);

        // Students
        Student s1 = new Student("NIYOBYOSE Isaac",12, Person.Gender.MALE,"RCA");
        Student s2 = new Student("XYZ",12, Person.Gender.FEMALE,"RCA");
        Student s3 = new Student("ABC",16, Person.Gender.MALE,"RCA");
        Student s4 = new Student("DEF",15, Person.Gender.FEMALE,"RCA");
        Student s5 = new Student("GHI",13, Person.Gender.MALE,"RCA");
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        // Teachers
        Teacher t1 = new Teacher("NIYOBYOSE Isaac",12, Person.Gender.MALE,"RCA");
        Teacher t2 = new Teacher("XYZ",12, Person.Gender.FEMALE,"RCA");
        Teacher t3 = new Teacher("ABC",16, Person.Gender.MALE,"RCA");
        Teacher t4 = new Teacher("DEF",15, Person.Gender.FEMALE,"RCA");
        Teacher t5 = new Teacher("GHI",13, Person.Gender.MALE,"RCA");
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        teachers.add(t5);

    }
}
