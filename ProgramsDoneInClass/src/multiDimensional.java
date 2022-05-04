class multiDimensional 
{ 
	public static void main(String args[]) 
	{ 
		// declaring and initializing 2D array 
		int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
		// printing 2D array 
		for (int i=0; i< 3 ; i++) 
		{ 
			for (int j=0; j < 3 ; j++) 
				System.out.print(arr[i][j] + " "); 

			System.out.println(); 
		} 
		ThreeDArray.display();
		
	} 
} 

class ThreeDArray
{
	static void display()
	{
		int threeD[][][] = new int[3][4][5];
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<4;j++)
			{
				for (int k=0;k<5;k++)
				{	
					threeD[i][j][k] = i+j+k;
					System.out.print(threeD[i][j][k] + " ");					
				}
				System.out.println();
			}
			System.out.println();
		}					
	}
}
