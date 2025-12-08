package multithreading.bankAccounting;

class Person  implements Runnable {
    public void run() {
        System.out.println("Hello from a thread!");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Person());
//(new Thread(new Person())).start();
        thread.run();
    }
}

