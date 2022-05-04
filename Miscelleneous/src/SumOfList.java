class Sum{
	public static void main(String[] args){
		int sum = 0;
		for(int iter=0;iter<args.length;iter++){
			sum = sum + Integer.parseInt(args[iter]);
		}
		System.out.print("Sum = " + sum);
	}
}