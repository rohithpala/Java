public class ThreadUsingRunnable implements Runnable{
    public void run(){
        System.out.println("Thread Created Successfully using Runnable");
    }
    public static void main(String[] args) {
        Thread newThread = new Thread(new ThreadUsingRunnable());
        newThread.start();
    }
}