class sync {
    /*synchronized*/ void display12() {
        System.out.println("1\n2\n" + Thread.currentThread().getName() + " is sleeping");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " woke up");
    }

    /*synchronized*/ void display3() {
        System.out.println("3\n" + Thread.currentThread().getName() + " is sleeping");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " woke up");
        System.out.println(Thread.currentThread().getName() + " exited");
    }
}

class sync1 implements Runnable {
    sync target;
    String name;
    Thread t;

    sync1(sync targetObject, String name) {
        target = targetObject;
        this.name = name;
        t = new Thread(this, name);
    }

    public void run() {
        synchronized (target) {  //Here 3 ways of synchs are used 1) syncing run - no use 2) syncing methods and 3) using synchronized block inside run. 2 & 3 are same
            target.display12();
            target.display3();
        }
    }
}

public class Synchronized {
    public static void main(String[] args) {
        sync targetObject = new sync();
        sync1 ob1 = new sync1(targetObject, "Thread1");
        sync1 ob2 = new sync1(targetObject, "Thread2");
        ob1.t.start();
        ob2.t.start();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
