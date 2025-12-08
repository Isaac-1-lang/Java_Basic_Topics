package multithreading.bankAccounting;

class Person22  extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
    }
}
public class Person2 {
    public static void main(String[] args) {
        Person22 person = new Person22();
        person.start();
    }
}

