package com.rca.student.model;
/**
* Represents a student in the student management system
*
* <p>
 * This is a class containing student properties and their methods
 * including firstname,lastname,age and others.
* </p>
*
 *  @author isaac-1-lang
 *  @since 1.0
*
*
 */

public class StudentModel {
    /**
     * First name of the student
     */
    private String firstName;
    /**
     * Last name of the student
     */
    private String lastName;
    /**
     * Age of the student
     */
    private int age;

    /**
     *  Constructs a new {@code StudentModel} with the specified details
     * @param firstName the first name of the s
     * @param lastName
     * @param age
     */
    public StudentModel(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Getter of the firstname of the student
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter of the first name of the student
     * @param firstName
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getting the last name of the student
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setting the last name of the student
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getting the age of the student
     * @return
     */

    public int getAge() {
        return age;
    }

    /**
     * Setting the age of the student
     * @param age
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Well formatted output.
     * @return
     */
    public String toString(){
        return firstName+" "+lastName+" "+age;
    }

}
