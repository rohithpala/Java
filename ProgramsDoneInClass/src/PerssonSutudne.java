class Person
{
	String name;
	Person()
	{
		System.out.println("#0");
	}
	Person(String name)
	{
		this.name= name;
		System.out.println("#1");
	}
}

class Student12 extends Person
{
	String studentstring;
	void displau() {}
	Student12(){
		this("Student");
		System.out.println("#3");
	}
	Student12(String name)
	{
		super(name);
		System.out.println("#2");
	}
}
public class PerssonSutudne 
{
	public static void main(String a[])
	{
		Person p = new Student12();
		Student12 ref = new Person();
		ref.
	}
}
