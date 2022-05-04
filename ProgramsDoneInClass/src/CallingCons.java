// Demonstrate when constructors are called.

// Create a super class.
class Parent {
	Parent() { 
		System.out.println("Inside Parent's constructor.");
	}
}

// Create a subclass by extending class A.
class Child extends Parent {
	Child() {
		System.out.println("Inside Child's constructor.");
	}
}

// Create another subclass by extending B.
class GrandChild extends Child {
	GrandChild() {
		System.out.println("Inside GrandChild's constructor.");
	}
}

public class CallingCons {
	public static void main(String args[]) {
		GrandChild c = new GrandChild();
	}
}
