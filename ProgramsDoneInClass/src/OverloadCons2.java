// Here, NewBox allows one object to initialize another.

class NewBox {
	double width;
	double height;
	double depth;

	// construct clone of an object
	NewBox(NewBox ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// constructor used when all dimensions specified
	NewBox(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// constructor used when no dimensions specified
	NewBox() {
		width = -1;  // use -1 to indicate
		height = -1; // an uninitialized
		depth = -1;  // NewBox
	}

	// constructor used when cube is created
	NewBox(double len) {
		width = height = depth = len;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}

public class OverloadCons2 {
	public static void main(String args[]) {
		// create NewBoxes using the various constructors
		NewBox myNewBox1 = new NewBox(10, 20, 15);
		NewBox myNewBox2 = new NewBox();
		NewBox mycube = new NewBox(7);

		NewBox myclone = new NewBox(myNewBox1);

		double vol;

		// get volume of first NewBox
		vol = myNewBox1.volume();
		System.out.println("Volume of myNewBox1 is " + vol);

		// get volume of second NewBox
		vol = myNewBox2.volume();
		System.out.println("Volume of myNewBox2 is " + vol);

		// get volume of cube
		vol = mycube.volume();
		System.out.println("Volume of cube is " + vol);

		// get volume of clone
		vol = myclone.volume();
		System.out.println("Volume of clone is " + vol);
	}
}
