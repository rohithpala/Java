//abstract 
class Ekniranjan
{
	 int pri_var;
	 private static Ekniranjan ref=null;
	 private Ekniranjan() {
		// TODO Auto-generated constructor stub
		pri_var=10;
	}
	 
	 //abstract void print();	 
	 
	 public static Ekniranjan getInstance()
	 {
		 if(ref == null)
		 {
			 ref = new Ekniranjan();	
			 return ref;
		 }
		 else
		 {
			 return ref;
		 }		 
	 }
	 public int getVar()
	 {
		 return pri_var++;
	 }
}

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ekniranjan reference1 = Ekniranjan.getInstance();
		Ekniranjan reference2 = Ekniranjan.getInstance();
		Ekniranjan reference3 = Ekniranjan.getInstance();
		
		reference1.getVar();
		reference2.getVar();
		reference3.getVar();
	}

}
