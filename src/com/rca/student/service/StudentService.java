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
     * @params student the {@link  StudentModel} object representing the student to add
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
     * @params id the unique identifier of the student to remove
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

}
