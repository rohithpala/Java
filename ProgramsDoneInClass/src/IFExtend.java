interface First {
	void meth1();
	void meth2();
}

// Second now includes meth1() and meth2() -- it adds meth3().
interface Second extends First {
	void meth3();
}

// This class must implement all of A and B
class MyClass implements Second {
	public void meth1() {
		System.out.println("Implement meth1().");
	}

	public void meth2() {
		System.out.println("Implement meth2().");
	}

	public void meth3() {
		System.out.println("Implement meth3().");
	}
}

public class IFExtend {
	public static void main(String arg[]) {
		MyClass ob = new MyClass();

		ob.meth1();
		ob.meth2();
		ob.meth3();
	}
}
