class A {
	//Thread Safe Instructions
	void foo(B b) {
		String name = Thread.currentThread().getName();

		System.out.println(name + " entered A.foo");

		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			System.out.println("A Interrupted");
		}

		System.out.println(name + " trying to call B.last()");
		b.last123();
	}

	void last456() {
		System.out.println("Inside A.last");
	}
}

class B{
	void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered B.bar");

		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			System.out.println("B Interrupted");
		}

		System.out.println(name + " trying to call A.last()");
		a.last456();
	}

	void last123() {
		System.out.println("Inside B.last");
	}
}

public class Deadlock implements Runnable {
	A a = new A();
	B b = new B();

	Deadlock() {
		Thread.currentThread().setName("MainThread");
		Thread t = new Thread(this, "RacingThread");
		Thread t2 = new Thread(new NewThread2("NEw Thread"));
		t.start();
		t2.start();

		a.foo(b); // get lock on a in this thread.
		System.out.println("Back in main thread");
	}

	public void run() {
		b.bar(a); // get lock on b in other thread.
		System.out.println("Back in other thread");
	}

	public static void main(String[] args) {
		//new Deadlock();
		String str = "Java";
		String str2 = "Java";
		String ref = new String("Java");
		if(str==ref)
			System.out.println("TRUE");
		else
			System.out.println("NOT TRUE");


	}
}
