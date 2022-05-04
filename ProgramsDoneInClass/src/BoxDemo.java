class Box {
	int width;
	int height;
	int depth;

	protected void finalize()
	{
		System.out.println("Finalize Called");
	}

	public String toString()
	{
		return "";
	}
	//default constructor
	Box()
	{
		width = height = depth = 1;
	}
	//usage of this keyword
	Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	//This is a parameterized constructor
	Box(int w) {
		width = w;
	}
	// This is an overloaded constructor for Box.
	Box(short w, short h, short d) {
		width = w;
		height = h;
		depth = d;
	}
	// compute and return volume
	int volume() {
		return width * height * depth;
	}
}

public class BoxDemo {
	public static void main(String args[]) {
		// declare, allocate, and initialize Box objects
		Box defaultbox = new Box();
		Box parameterizedbox = new Box(10);
		Box overloadedbox1 = new Box(1024, 220, 145);
		Box overloadedbox2 = new Box(3, 6, 9);

		int vol;

		// get volume of default box
		vol = defaultbox.volume();
		System.out.println("Volume is " + vol);

		// get volume of parameterized box 
		vol = parameterizedbox.volume();
		System.out.println("Volume is " + vol);

		// get volume of overloaded box 1
		vol = overloadedbox1.volume();
		System.out.println("Volume is " + vol);

		// get volume of overloaded box 2
		vol = overloadedbox2.volume();
		System.out.println("Volume is " + vol);
	}


	protected void finalize()
	{
		System.out.println("Finalize Called");
	}
}
