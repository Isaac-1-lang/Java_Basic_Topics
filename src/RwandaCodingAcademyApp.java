// RwandaCodingAcademyApp.java
// A comprehensive Java OOP example modeling RCA with core concepts

import java.util.ArrayList;
import java.util.List;

// Base class: Person
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter & Setter (Encapsulation)
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
        if(age > 0) this.age = age;
        else System.out.println("Invalid age");
    }

    // Method (can be overridden)
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Interface for coding skills
interface Coder {
    void writeCode();
    void debugCode();
}

// Student class extends Person and implements Coder
class Student extends Person implements Coder {
    private String program;  // e.g. Software Engineering, Cybersecurity

    public Student(String name, int age, String program) {
        super(name, age);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    // Override displayInfo (Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Program: " + program);
    }

    // Implement Coder methods
    @Override
    public void writeCode() {
        System.out.println(getName() + " is writing code for " + program);
    }

    @Override
    public void debugCode() {
        System.out.println(getName() + " is debugging code.");
    }
}

// Staff class extends Person
class Staff extends Person {
    private String role; // e.g. Instructor, Admin

    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    // Method specific to Staff
    public void work() {
        System.out.println(getName() + " is working as " + role);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + role);
    }
}

// Custom Exception for invalid admission
class AdmissionException extends Exception {
    public AdmissionException(String message) {
        super(message);
    }
}

// RCA Academy class with static fields and methods
class RwandaCodingAcademy {
    private static String location = "Nyabihu District, Western Province";
    private static int establishedYear = 2019;
    private List<Student> students;
    private List<Staff> staff;

    // Constructor
    public RwandaCodingAcademy() {
        students = new ArrayList<>();
        staff = new ArrayList<>();
    }

    public static String getLocation() {
        return location;
    }

    public static int getEstablishedYear() {
        return establishedYear;
    }

    // Add student with simple admission rule (throws exception if invalid)
    public void admitStudent(Student s) throws AdmissionException {
        if (s.getAge() < 16) {
            throw new AdmissionException("Student " + s.getName() + " is too young for admission.");
        }
        students.add(s);
        System.out.println("Student " + s.getName() + " admitted to program: " + s.getProgram());
    }

    public void hireStaff(Staff s) {
        staff.add(s);
        System.out.println("Staff " + s.getName() + " hired as " + s.getRole());
    }

    // List all students
    public void listStudents() {
        System.out.println("\n--- List of Students ---");
        for (Student s : students) {
            s.displayInfo();
            s.writeCode();
            s.debugCode();
            System.out.println();
        }
    }

    // List all staff
    public void listStaff() {
        System.out.println("\n--- List of Staff ---");
        for (Staff s : staff) {
            s.displayInfo();
            s.work();
            System.out.println();
        }
    }
}

// Main class to run the program
public class RwandaCodingAcademyApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Rwanda Coding Academy!");
        System.out.println("Location: " + RwandaCodingAcademy.getLocation());
        System.out.println("Established: " + RwandaCodingAcademy.getEstablishedYear());

        RwandaCodingAcademy rca = new RwandaCodingAcademy();

        // Create students
        Student isaac = new Student("Isaac", 20, "Software Engineering");
        Student elissa = new Student("Elissa", 15, "Cybersecurity"); // Too young for admission

        // Create staff
        Staff john = new Staff("John", 35, "Instructor");
        Staff jane = new Staff("Jane", 28, "Administrator");

        // Admit students with exception handling
        try {
            rca.admitStudent(isaac);
            rca.admitStudent(elissa); // Should throw exception
        } catch (AdmissionException e) {
            System.out.println("Admission Error: " + e.getMessage());
        }

        // Hire staff
        rca.hireStaff(john);
        rca.hireStaff(jane);

        // List all
        rca.listStudents();
        rca.listStaff();
    }
}
