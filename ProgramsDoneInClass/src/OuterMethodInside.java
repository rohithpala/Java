public class OuterMethodInside 
{
	private String x = "Outer2";
	void doStuff() 
	{
		String z = "local variable";		
		class MethodInside 
		{
			public void seeOuter() 
			{
				System.out.println("Outer x is " + x);
				System.out.println("Local var z is " + z); 
			} // close inner class method
		} // close inner class definition
		MethodInside mi;
		mi = new MethodInside();
		mi.seeOuter();		
	} // close outer class method doStuff()
	public static void main(String a[])
	{
		OuterMethodInside ref = new OuterMethodInside();
		ref.doStuff();
		ref.doStuff();
	}
} // close outer class