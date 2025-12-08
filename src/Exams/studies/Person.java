package Exams.studies;

import javax.crypto.spec.PSource;

public class Person  implements  Runnable{
    private String name;


    Person(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Thread "+name + " prints: "+ i);
                try {

                    Thread.sleep(1000);
                }
                catch(InterruptedException e) {
                    System.out.println("Thread "+name + " interrupted");
                }
        }
    }
}

