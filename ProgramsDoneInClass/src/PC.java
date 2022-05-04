import oracle.jdbc.*;
import oracle.jdbc.driver.OracleDriver;


class Q {
	int n;

	 int get() {
		System.out.println("Got: " + n--);		
		return n;
	}

	 void put(int n) {
		this.n = n;
		System.out.println("Put: " + n);
	}
}

class Producer implements Runnable {
	QQ q;

	Producer(QQ q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		int i = 0;
		boolean ref = new OracleDriver().acceptsURL("oracle.JDBCODBCDriver");
		while(true) {
			q.put(i++);
		}
	}
}

class Consumer implements Runnable {
	QQ q;

	Consumer(QQ q) {
		this.q = q;
		new Thread(this, "Consumer").start();		
		
		
		
	}

	public void run() {
		while(true) {
			q.get();
		}
	}
}

public class PC {
	public static void main(String args[]) {
		QQ q = new QQ();
		QQ q2 = new QQ();
		new Producer(q);
		new Producer(q2);
		new Consumer(q);
		new Consumer(q);
		new Consumer(q2);

		System.out.println("Press Control-C to stop.");
	}
}
