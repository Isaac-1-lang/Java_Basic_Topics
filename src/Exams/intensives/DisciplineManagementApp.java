package Exams.intensives;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DisciplineManagementApp {

    public static void main(String[] args) {


        ExecutorService executor = Executors.newFixedThreadPool(3);


        // Create some students

        Student s1 = new Student(1,"Precieux",80);
        Student s2 = new Student(2,"Myself",40);
        Student s3 = new Student(3,"Mine",30);
        Student s4 = new Student(4,"Isaac",10);



        executor.submit(new DisciplineUpdateTask(s1,5,"Benon"));
        executor.submit(new DisciplineUpdateTask(s2,5,"PM"));
        executor.submit(new DisciplineUpdateTask(s3,5,"Benilde"));




        executor.submit(new DisciplineUpdateTask(s4,5,"Benon"));
        executor.shutdown();




        while (!executor.isTerminated()) {

        }
        System.out.println("Discipline management app has been terminated");


        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s2);
    }
}
