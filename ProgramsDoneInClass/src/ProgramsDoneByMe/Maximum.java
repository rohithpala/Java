package ProgramsDoneByMe;

class Maximum{
	public static void main(String[] maximum){
		int max = Integer.parseInt(maximum[0]);
		for(int iter=0;iter<maximum.length;iter++){
			if(Integer.parseInt(maximum[iter])>max) max = Integer.parseInt(maximum[iter]);
		}
		System.out.println(max);
	}
}