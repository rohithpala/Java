public class OuterClass {
	private int x = 7; //Design Patterns: Singleton
	public void outerMethod() {
		InnerClass in = new InnerClass(); // make an inner instance
		in.innerMethod();
	}
	class InnerClass {
		public  void innerMethod() {
			System.out.println("Outer x is " + x);
		}
	}
	public static void main(String[] args) {
		OuterClass mo = new OuterClass(); // gotta get an instance!
		//mo.outerMethod();
		InnerClass ref = new OuterClass().new InnerClass();
		ref.innerMethod();
		
	}
}