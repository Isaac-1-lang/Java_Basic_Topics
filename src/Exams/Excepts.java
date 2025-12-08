package Exams;


import java.time.LocalDate;
public class Excepts {
    public static void main(String[] args) {
        String s= null;
        try {
            System.out.println(s.length());
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }

        int[] arr = {12,45,43,205,400,3210,80};
        try {
            System.out.println(arr[30]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
