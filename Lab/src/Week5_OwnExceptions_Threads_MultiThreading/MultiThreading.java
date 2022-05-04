package Week5_OwnExceptions_Threads_MultiThreading;

public class MultiThreading extends Thread{
    public void run() {
        for (byte i = 1; i <= 5 ; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            }catch (InterruptedException exception){
                System.out.println("Process Interrupted with Exception " + exception);
            }
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiThreading());
        t1.start();
        Thread t2 = new Thread(new MultiThreading());
        t2.start();
    }
}