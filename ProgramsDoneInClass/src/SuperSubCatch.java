public class SuperSubCatch {
	public static void main(String args[]) {
		try 
		
		{
		try {
			int a = 0;
			//args[0]="Sashi";
			int b = 42 / a;
			//throw new ClassNotFoundException();
		} 
		finally
		{
			System.out.println("Sorry cant help");
		}
		}
		finally
		{
			
		}
		/* This catch is never reached because
       ArithmeticException is a subclass of Exception. */
		/*	
		}*/
	}
}
