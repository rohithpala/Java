//1. Creating a thread by implement Runnable
public class DemoThread1 implements Runnable{
	Thread t1;
	public DemoThread1() 
	{
		t1 = new Thread(this,"MY Second Thread");
		t1.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoThread1();
	}
	public void run()
	{
		for(int incr=0;incr<5;incr++)
		{
			System.out.println(incr);			
		}		
	}
}