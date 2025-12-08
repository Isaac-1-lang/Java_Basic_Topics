package multithreading.bankAccounting;

class NewThread  implements Runnable {
    String name;
    Thread t;
    NewThread(String threadName){
        name=threadName;
        t=new Thread(this,name);
        System.out.println("New Thread:"+t);
    }
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
public class Main2 {
    public static void main(String[] args) {
        NewThread thread1 = new NewThread("One");
        NewThread thread2 = new NewThread("Two");
        NewThread thread3 = new NewThread("Third");
        thread1.t.run();
        thread2.t.start();
        thread3.t.start();
        try {
            Thread.sleep(1000);

        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
