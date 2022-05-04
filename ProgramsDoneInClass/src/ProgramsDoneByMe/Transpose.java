package ProgramsDoneByMe;

import java.util.Scanner;

class TransposeMatrix{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Row Size: ");
		int rowSize = input.nextInt();
		System.out.print("Enter Column Size: ");
		int colSize = input.nextInt();
		float arr[][] = new float[rowSize][colSize];
		float resArr[][] = new float[colSize][rowSize];
		System.out.println("Enter Array Elements: ");
		for(int rowIter=0;rowIter<rowSize;rowIter++){
			for(int colIter=0;colIter<colSize;colIter++){
				Scanner arrInput = new Scanner(System.in);
				arr[rowIter][colIter] = arrInput.nextFloat();
			}
		}
		for(int colIter=0;colIter<colSize;colIter++){
			for(int rowIter=0;rowIter<rowSize;rowIter++){
				resArr[colIter][rowIter] = arr[colIter][rowIter];
			}
		}
		for(int rowIter=0;rowIter<rowSize;rowIter++){
			for(int colIter=0;colIter<colSize;colIter++){
				System.out.print(resArr[colIter][rowIter] + " ");
			}
			System.out.print("\n");
		}
	}
}
