import java.util.Scanner;
class FindFactorial{
	public static int Factorial(int num){
		int fact = 1;
		for(int iter=1;iter<=num;iter++){
			fact*=iter;
		}
		return fact;
	} 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int size = input.nextInt();
		int found = 0;
		int arr[] = new int[size];
		System.out.print("Enter " + size + " Elements: ");
		for(int iter=0;iter<size;iter++)
			arr[iter] = input.nextInt();
		System.out.print("Enter Factorial of number to be searched: ");
		int factOfNumberToBeSearched = input.nextInt();
		for(int iter=0;iter<size;iter++){
			if(arr[iter]==Factorial(factOfNumberToBeSearched)){
				found = 1;
				System.out.println("Factorial of " + factOfNumberToBeSearched + " found at position " + (iter+1) + " and = " + Factorial(factOfNumberToBeSearched));
			}
		}
		if(found==0)
			System.out.println(factOfNumberToBeSearched + " not found");
	}
}