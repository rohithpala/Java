class Count {
    int n;
    boolean flag = false;

    synchronized void setCount(int n) {
        if (flag) {
            try {
                wait();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        this.n = n;
        System.out.println("Set Count : " + n);
        flag = true;
        notify();
    }

    synchronized void getCount() {
        if (!flag) {
            try {
                wait();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        System.out.println("Get Count : " + n);
        flag = false;
        notify();
    }
}

class Setter implements Runnable {
    int i = 1;
    private Count count;
    Thread t;

    Setter(Count count) {
        this.count = count;
        t = new Thread(this);
    }

    public void run() {
        while (true) {
            count.setCount(i++);
        }
    }
}

class Getter implements Runnable {
    private Count count;
    Thread t;

    Getter(Count count) {
        this.count = count;
        t = new Thread(this);
    }

    public void run() {
        while (true) {
            count.getCount();
        }
    }
}

public class InterProcessCommunication {
    public static void main(String[] args) {
        Count count = new Count();
        Setter set = new Setter(count);
        Getter get = new Getter(count);
        //Getter get2 = new Getter(count);
        set.t.start();
        get.t.start();
        //get2.t.start();
    }
}