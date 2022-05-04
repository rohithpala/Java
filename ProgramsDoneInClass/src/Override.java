// Method overriding.
class Students {
	int i, j;

	Students()
	{
		i=j=1;
	}
	Students(int a, int b) {
		i = a;
		j = b;
	}

	// display i and j
	void show() {
		System.out.println("Acting as if we are listening to all classes");
	}
	
}

class BeforeExams extends Students {
	int k;

	BeforeExams()
	{
		
	}
	
	BeforeExams(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	void display()
	{
		
	}

	// display k -- this overrides show() in A
	void show() {
		System.out.println("Meeru Etla ante atle Sir!!!");
	}
}


class AfterExams extends Students {
	int k;

	AfterExams()
	{
		
	}
	
	AfterExams(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// display k -- this overrides show() in A
	void show() {
		System.out.println("Naa istam Nenu inthe :)");
	}
}

public class Override {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Students Rakesh = new Students();
		//BeforeExams RakeshBefore = new BeforeExams(1, 2, 3);
		//AfterExams RakeshAfter = new AfterExams(1, 2, 3);

		
		//Rakesh = RakeshBefore;
		
		//Rakesh = RakeshAfter;
		
		
		Class c = Class.forName(args[0]);
		Rakesh = (Students) c.newInstance();
		
		Rakesh.show();
		
	}
}
