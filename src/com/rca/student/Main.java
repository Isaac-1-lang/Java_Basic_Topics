package com.rca.student;

import com.rca.student.model.StudentModel;

/**
 * Main class for the Student Management System.
 * This class serves as the entry point for demonstrating the functionality of the system.
 */
public class Main {
    /**
     * The main method is the entry point of the application.
     * It demonstrates creating student objects and using their methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        StudentModel s1 = new StudentModel("Isaac","Precieux", 20,1);
        StudentModel s2 = new StudentModel("Niyobyose","Isei", 21,2);
        System.out.println(s1);
        System.out.println(s2);
        s1.getFirstName();
        s1.getId();
        s1.getAge();
        s2.getLastName();
        s2.setLastName("Newton");
    }
}
