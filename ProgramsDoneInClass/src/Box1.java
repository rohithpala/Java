public class Box1 
{
	int array[]; //MEMBER VARIABLE
	int len, bre, hei;
	float weight; //MEMBER VARIABLE
	
	public Box1() 
	{
		array = new int[10];
		weight = 0.1f;	
		len=bre=hei=0;
	}
	
	public void init(int val)
	{
		len=bre=hei=val;		
		for(int i=0;i<array.length;i++)
			array[i]=0;
	}	
	void display()
	{
		for(int var:array)
		{
			System.out.print(var);
		}
	}
	
	public String toString()
	{
		return len +":"+bre+":"+hei;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 ref1 = new Box1(); 
		System.out.println("Box 1 Len Bre Hei are"+ref1);
		ref1.init(4);
		System.out.println("Box 1 Len Bre Hei now are"+ref1);
		ref1.display();
		System.out.println();
		
		Box1 ref2 = new Box1(); 
		System.out.println("Box 2 Len Bre Hei are"+ref2);
		ref2.init(10);
		System.out.println("Box 2 Len Bre Hei now are"+ref2);
		ref2.display();
	}
}
