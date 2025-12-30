package Exams.intensives;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DisciplineManagementApp {

    public static void main(String[] args) {


        ExecutorService executor = Executors.newFixedThreadPool(30);


        // Create some students

        Student s1 = new Student(1,"Precieux",80);
        Student s2 = new Student(2,"Myself",40);
        Student s3 = new Student(3,"Mine",30);
        Student s4 = new Student(4,"Isaac",10);
        Student s5 = new Student(1,"Precieux",80);
        Student s6 = new Student(2,"Myself",40);
        Student s7 = new Student(3,"Mine",30);
        Student s8 = new Student(4,"Isaac",10);
        Student s9 = new Student(1,"Precieux",80);
        Student s10 = new Student(2,"Myself",40);
        Student s11 = new Student(3,"Mine",30);
        Student s12 = new Student(4,"Isaac",10);
        Student s13 = new Student(1,"Precieux",80);
        Student s14 = new Student(2,"Myself",40);
        Student s15 = new Student(3,"Mine",30);
        Student s16 = new Student(4,"Isaac",10);
        Student s17 = new Student(1,"Precieux",80);
        Student s18 = new Student(2,"Myself",40);
        Student s19 = new Student(3,"Mine",30);
        Student s20 = new Student(4,"Isaac",10);
        Student s21 = new Student(1,"Precieux",80);
        Student s22 = new Student(2,"Myself",40);
        Student s23 = new Student(3,"Mine",30);
        Student s24 = new Student(4,"Isaac",10);
        Student s25 = new Student(1,"Precieux",80);
        Student s26 = new Student(2,"Myself",40);
        Student s27= new Student(3,"Mine",30);
        Student s28 = new Student(4,"Isaac",10);
        Student s29 = new Student(1,"Precieux",80);
        Student s30 = new Student(2,"Myself",40);
        Student s32 = new Student(3,"Mine",30);
        Student s33 = new Student(4,"Isaac",10);



        executor.submit(new DisciplineUpdateTask(s1,5,"Benon"));
        executor.submit(new DisciplineUpdateTask(s2,5,"PM"));
        executor.submit(new DisciplineUpdateTask(s3,5,"Benilde"));
        executor.submit(new DisciplineUpdateTask(s4,5,"Benon"));
        executor.submit(new DisciplineUpdateTask(s5,5,"PM"));
        executor.submit(new DisciplineUpdateTask(s13,5,"Benilde"));
        executor.submit(new DisciplineUpdateTask(s12,5,"Benon"));
        executor.submit(new DisciplineUpdateTask(s22,5,"PM"));
        executor.submit(new DisciplineUpdateTask(s33,5,"Benilde"));
        executor.submit(new DisciplineUpdateTask(s16,5,"Benon"));
        executor.submit(new DisciplineUpdateTask(s17,5,"PM"));
        executor.submit(new DisciplineUpdateTask(s18,5,"Benilde"));
        executor.submit(new DisciplineUpdateTask(s19,5,"Benon"));
        executor.submit(new DisciplineUpdateTask(s20,23,"PM"));
        executor.submit(new DisciplineUpdateTask(s3,51,"Benilde"));
        executor.submit(new DisciplineUpdateTask(s28,52,"Benon"));
        executor.submit(new DisciplineUpdateTask(s2,50,"PM"));
        executor.submit(new DisciplineUpdateTask(s3,50,"Benilde"));
        executor.submit(new DisciplineUpdateTask(s1,51,"Benon"));
        executor.submit(new DisciplineUpdateTask(s2,15,"PM"));
        executor.submit(new DisciplineUpdateTask(s3,25,"Benilde"));
        executor.submit(new DisciplineUpdateTask(s1,4,"Benon"));
        executor.submit(new DisciplineUpdateTask(s2,15,"PM"));
        executor.submit(new DisciplineUpdateTask(s3,65,"Benilde"));
        executor.submit(new DisciplineUpdateTask(s1,67,"Benon"));
        executor.submit(new DisciplineUpdateTask(s2,34,"PM"));
        executor.submit(new DisciplineUpdateTask(s3,80,"Benilde"));





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
