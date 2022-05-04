// Demonstrate method overloading.
class Overload {
	double a;
	void test() {
		System.out.println("No parameters");
	}

	// Overload test for one integer parameter.
	/*void test(int a) {
		System.out.println("a: " + a);
	}*/

	// Overload test for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}
	void display()
	{
		System.out.println("HEllos");
	}
	// overload test for a double parameter
	double test(double a) {		
		display();
		return a*a;
		
		
	}
}

public class OverloadDemo {
	public static void main(String args[]) {
		Overload ob = new Overload();
		double result;

		// call all versions of test()
		ob.test(); 
		ob.test(10);
		ob.test(10, 20);
		result = ob.test(123.9f);
		System.out.println("Result of ob.test(123.25): " + result);
	}
}
