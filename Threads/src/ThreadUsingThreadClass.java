public class ThreadUsingThreadClass extends Thread{
    public void run(){
        System.out.println("Thread Created Successfully using Thread Class");
    }
    public static void main(String[] args) {
        Thread newThread = new Thread(new ThreadUsingThreadClass());
        newThread.start();
        System.out.println(newThread);
    }
}
