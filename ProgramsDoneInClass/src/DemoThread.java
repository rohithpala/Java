//1. Creating a thread by extending Thread class
public class DemoThread extends Thread{
	
	public DemoThread() 
	{
		super("My First Thread");
		start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoThread();
	}
	
	public void run()
	{
		for(int incr=0;incr<5;incr++)
		{
			System.out.println(incr);			
		}		
	}
}