package Week5_OwnExceptions_Threads_MultiThreading;

public class ThreadUsingRunnableProb5 implements Runnable{
    public void run(){
        System.out.println("Thread Created Successfully using Runnable");
    }
    public static void main(String[] args) {
        Thread newThread = new Thread(new ThreadUsingRunnableProb5());
        newThread.start();
    }
}