// Objects may be passed to methods.
class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}
	
	Test(Test ref)
	{
		a = ref.a;
		b = ref.b;
	}

	// return true if o is equal to the invoking object
	boolean equals(Test o) {
		if(o.a == a && o.b == b) return true;
		else return false;
	}
	
	boolean testWithBox(Box b)
	{
		if(b.width == a && b.depth == this.b)
		{	
		System.out.print(b.width +","+a+","+b.depth+","+this.b);
			return true;
		}
		else
		{
			System.out.print(b.width +","+a+","+b.depth+","+this.b);
			return false;
		}
	}
}

public class PassOb {
	public static void main(String args[]) {
		Test ob1 = new Test(100, 22);
		Test ob2 = new Test(100, 22);
		Test ref2 = new Test(ob1);
		Test ob3 = new Test(-1, -1);
		Box reff = new Box(100,100,22);

		System.out.println("ob1 == ob2: " + ob1.equals(ob2));

		System.out.println("ob1 == ob3: " + ob1.equals(ob3));
		
		System.out.println("ob1 == Box: " + ob1.testWithBox(reff));
	}
}
