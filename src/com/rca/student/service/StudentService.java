package com.rca.student.service;

import com.rca.student.model.StudentModel;
import com.rca.student.exception.StudentNotFoundException;
import java.util.List;
import java.util.ArrayList;

/**
 * Provides services for managing students in the system
 *
 * <p>
 *     This class handles operations such as adding,finding,removing and listing student(s).
 *     All methods that attempt to find student by Id or email throw
 *     {@link StudentNotFoundException} if no matching student is found.
 *
 * </p>
 *
 *
 * @author Isaac-1-lang
 * @since 1.0
 * @see com.rca.student.model.StudentModel
 * @see com.rca.student.exception.StudentNotFoundException
 */
public class StudentService {
    // Internal storage for students
    private final List<StudentModel> students = new ArrayList<>();


    /**
     * Adds a new student to the system
     *
     *
     * @param student the {@link  StudentModel} object representing the student to add
     * @throws IllegalArgumentException if the student is null
     */

    public void addStudent(StudentModel student) {
        if(student==null) {
            throw  new IllegalArgumentException("Student cannot be null");
        }
        students.add(student);
    }

    /**
     * Finds a student by their ID
     *
     * @param id the unique identifier of the student
     * @return the {@link StudentModel} object matching the ID
     * @throws StudentNotFoundException if no student with the given ID exists
     * @see #addStudent(StudentModel)
     */
    public StudentModel findStudentById(int id ) {
        return (StudentModel) students.stream()
                .filter(s->s.getId() == id)
                .findFirst()
                .orElseThrow(()-> new StudentNotFoundException("Student with id "+id+" not found"));

    }
    /**
     * Removes a student from the system by their ID
     *
     * @param id the unique identifier of the student to remove
     * @throws StudentNotFoundException if no student with the given ID exists
     * @see #findStudentById(int)
     */


    public void removeStudentById(int id) {
        StudentModel student = findStudentById(id);
        students.remove(student);
    }

    /**
     * Rrturns a list of all students currently in the system
     *
     * @return a list of {@link StudentModel} objects
     */

    public List<StudentModel> getAllStudents() {
        return new ArrayList<>(students);
    }

    /**
     * Finds a student by their first and last name.
     *
     * <p>
     * This method is deprecated because searching by ID or email is preferred
     * for uniqueness and performance.
     * </p>
     *
     * @param firstName the first name of the student
     * @param lastName  the last name of the student
     * @return the {@link com.rca.student.model.StudentModel} object matching the name
     * @throws com.rca.student.exception.StudentNotFoundException if no student is found
     * @deprecated Use {@link #findStudentById(int)} instead.
     */
    @Deprecated
    public StudentModel findStudentByName(String firstName, String lastName) {
        return students.stream()
                .filter(s -> s.getFirstName().equalsIgnoreCase(firstName)
                        && s.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException(
                        "Student " + firstName + " " + lastName + " not found"));
    }


}
