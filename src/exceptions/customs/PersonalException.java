package exceptions.customs;

import rca.ac.rw.mis.Person;

import java.util.Objects;

public class PersonalException extends Exception {
    private String msg;
    PersonalException(String msg) {
        super(msg);
    }
}


class CheckNationality {
    static void checkNationality(String country) throws PersonalException {
        if(!Objects.equals(country, "Rwanda")) {
            throw new PersonalException("Your nationality is not valid");
        }
    }

    public static void main(String[] args) {
        try {
            checkNationality("Uganda");
            checkNationality("Rwanda");
        } catch (PersonalException e) {
            System.out.println(e.getMessage());
        }
    }
}
