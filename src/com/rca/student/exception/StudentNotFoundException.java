package com.rca.student.exception;

/**
 * Thrown to indicate that a requested student could not be found at a time
 *
 * <p>
 *     This exception it typically thrown service-layer methods
 *     when a student with the specified identifier does not exist
 * </p>
 *
 *
 * @author Isaac-1-lang
 * @since 1.0
 * @see com.rca.student.service.StudentService
 */

public class StudentNotFoundException extends RuntimeException {
    /**
     * Constructs a new {@code StudentNotFoundException} with no details message
     */
    public StudentNotFoundException() {
        super();
    }
    /**
     * Constructs a new {@code StudentNotFoundException} with the specified detail message
     *
     * @param message the detail message explaining why the student was not found
     */
    public StudentNotFoundException(String message) {
        super(message);
    }
}
