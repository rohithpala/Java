class Test1223
{
	int atr;
	Test1223()
	{

	}
	void print()
	{

	}
	void dispay()
	{

	}
}

public class StaticTest{//extends Test1223{
	static int static_var;
	int nonstatic_var;
	String str;
	//static_var=1;
	StaticTest()
	{

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest ref = new StaticTest();
		System.out.println(ref.nonstatic_var+ref.str+ref.static_var);		
		ref.dispay();
	}
	void dispay()
	{
		
	}

}
