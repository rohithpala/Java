class Popcorn {
	public void pop() {
		System.out.println("popcorn");//Adapter classes
	}
}

class PopcornSizzle extends Popcorn
{
	public void sizzle() {
		System.out.println("anonymous sizzling popcorn");
	}
	public void pop() {
		System.out.println("anonymous popcorn");
		sizzle();
	}
}
class Food {

	PopcornSizzle p;
	Popcorn p1;
	Food()
	{
		p = new PopcornSizzle();

		p1 = new Popcorn() {
			public void sizzle() {
				System.out.println("anonymous sizzling popcorn");
			}
			public void pop() {
				System.out.println("anonymous popcorn");
				sizzle();
			}

		};
	}
	public void popIt() {
		p1.pop();
		p1 = new Popcorn();
		p1.pop();
		p1 = p;

	}

}

public class TestDemo
{
	public static void main(String a[])
	{
		demo123 ref = new demo123();
		ref.test = new test1234();
		ref.callme();
	}
}
