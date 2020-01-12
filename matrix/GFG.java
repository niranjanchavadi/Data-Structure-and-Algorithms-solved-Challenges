// Java program to rotate a 
// matrix by 180 degrees 
 

class GFG { 
	static int N = 3; 

	// Function to Rotate the 
	// matrix by 180 degree 
	static void rotateMatrix(int mat[][]) 
	{ 

		// Simply print from last 
		// cell to first cell. 
		for (int i = N - 1; i >= 0; i--) { 
			for (int j = N - 1; j >= 0; j--) 
				System.out.print(mat[i][j] + " "); 

			System.out.println(); 
		} 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		int[][] mat = { { 1, 2, 3 }, 
						{ 4, 5, 6 }, 
						{ 7, 8, 9 } }; 

		rotateMatrix(mat); 
	} 
} 

// This code is contributed by ChitraNayal 
//is code is contributed by ChitraNayal 
