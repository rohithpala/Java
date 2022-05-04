public class Exc0 {
		static int b=0;
		static void setB(int var)
		{
			b=var;
			System.out.println(b);
		}
	public static void main(String args[]) {
		try
		{
			int a = 42 / b;
			int var = Integer.parseInt(args[0]);
			System.out.println(a+var);
		}
		catch(NullPointerException e)
		{
			System.out.println("B cannot be 0:"+e);
			setB(1);
			String ar[] = {};
			main(null);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Pass CMD LINE ARGS");
			String ar[] = {"1"};
			main(ar);
		}
	}
}
