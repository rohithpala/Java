package ProgramsDoneByMe;

class Reverse{
	public static void main(String[] reverse){
		for(int iter=0;iter<reverse.length;iter++){
			System.out.print(reverse[reverse.length-iter-1] + " ");
		}
	}
}