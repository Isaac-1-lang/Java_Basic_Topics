package multithreading.bankAccounting;

public class MainProgram {
    public static void main(String[] args) {
        Thread thread  = Thread.currentThread();
        System.out.println("Current thread:"+ thread);
        thread.setName("MyThread");
        System.out.println("After name change:"+ thread);
        try {
            for(int i=5;i>0;i--) {
                System.out.println(i);
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());;
        }
    }
}
