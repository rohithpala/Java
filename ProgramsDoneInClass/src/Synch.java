import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Callme {
	void call(String msg) {
		try {
			System.out.print("[" + msg);
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}

	void  display(String msg) {
		try {
			System.out.print("[" + msg+1);
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;

	public Caller(Callme targ, String s) throws InterruptedException {
		target = targ;
		msg = s;
		t = new Thread(this);
		//t.start();//1. UNCOMMENT ME WHEN YOU WANT TO IDENTIFY THE TIME TAKEN TO COMPLETION WITH THREADS
		target.call(msg);//2.COMMENT ME WHEN YOU WANT TO IDENTIFY THE TIME TAKEN TO COMPLETION WITH THREADS
	}

	public void run() {
		target.call(msg);
	}
}

public class Synch {
	public static void main(String args[]) throws Exception{
		Callme target = new Callme();
		Callme target2 = new Callme();
		Callme target3 = new Callme();
		//sTART TIME

		Date start = Calendar.getInstance().getTime();
		Caller ob1 = new Caller(target, "Hello");

		Caller ob2 = new Caller(target, "Synchronized");

		Caller ob3 = new Caller(target, "World");

		// wait for threads to end
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		Date end = Calendar.getInstance().getTime();
		System.out.println("TOTAL TIME TO COMPLETION IS: "+((end.getTime()-start.getTime())/1000.0f)+"seconds");
	}
}
