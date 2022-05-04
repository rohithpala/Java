public class OuterReference {
	private int x = 7;
	public void makeInner() {
		InnerReference in = new InnerReference();
		System.out.println("Outer class ref is "+in.x);
		in.seeOuter();		
	}
	class InnerReference {
		private int x = 10;
		public void seeOuter() {
			System.out.println("Outer x is " + x);
			System.out.println("Inner class ref is " + this);
		
		}
		public String toString()
		{
			return "Inner Class";
		}		
	}
	public static void main (String[] args) {
		InnerReference inner = new OuterReference().new InnerReference();
		inner.seeOuter();
		//new OuterReference().makeInner();
	}
	
	/*public String toString()
	{
		return "Inner Class";
	}*/
}