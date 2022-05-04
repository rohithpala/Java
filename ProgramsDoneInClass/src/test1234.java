public class test1234 {
	void display()
	{
		System.out.print("I M DISPLAY");
	}
}

class demo123
{
	test1234 test;
	demo123()
	{
		test = new test1234()
				{
					void print()
					{
						System.out.print("I M PRINT");
					}
					void display()
					{
						System.out.print("I M OVERRIDDEN DISPLAY");
						print();
						
					}
				};
	}
	void callme()
	{
		test.display();
	}
}

