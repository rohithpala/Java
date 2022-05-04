// A Simple demonstration of abstract.
abstract class AbstractClass{
	//abstract void learntowin();

	// concrete methods are still allowed in abstract classes
	void callmetoo() {
		System.out.println("This is a concrete method.");
	}
}

class ConcreteClass extends AbstractClass{
	void learntowin() {
		System.out.println("B's implementation of callme.");
	}
}

public class AbstractDemo{
	public static void main(String args[]) {
		ConcreteClass ref = new ConcreteClass();
		
		ref.learntowin();
		ref.callmetoo();
	}
}
