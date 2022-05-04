import java.util.Scanner;

public class TransposeMatrixPrinting{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Row Size: ");
		int rowSize = input.nextInt();
		System.out.print("Enter Column Size: ");
		int colSize = input.nextInt();
		float arr[][] = new float[rowSize][colSize];
		System.out.println("Enter Array Elements: ");
		for(int rowIter=0;rowIter<rowSize;rowIter++){
			for(int colIter=0;colIter<colSize;colIter++){
				arr[rowIter][colIter] = input.nextFloat();
			}
		}
		for(int colIter=0;colIter<colSize;colIter++){
			for(int rowIter=0;rowIter<rowSize;rowIter++){
				System.out.print(arr[colIter][rowIter] + " ");
			}
			System.out.print("\n");
		}
	}
}
