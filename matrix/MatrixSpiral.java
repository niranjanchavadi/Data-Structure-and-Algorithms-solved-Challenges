import java.io.*; 
import java.util.*; 

class MatrixSpiral { 
  static Scanner scan = new Scanner (System.in);
  static int n = scan.nextInt();
	// Prints spiral matrix of size n x n 
	// containing numbers from 1 to n x n 
	static void printSpiral(int n) 
	{ 
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n; j++) { 
				
				// x stores the layer in which (i, j)th 
				// element lies 
				int x; 

				// Finds minimum of four inputs 
				x = Math.min(Math.min(i, j), 
					Math.min(n - 1 - i, n - 1 - j)); 

				// For upper right half 
				if (i <= j) 
					System.out.print((n - 2 * x) * (n - 2 * x) - 
									(i - x) - (j - x) + "\t"); 

				// for lower left half 
				else
					System.out.print((n - 2 * x - 2) * (n - 2 * x - 2) + 
									(i - x) + (j - x) + "\t"); 
			} 
			System.out.println(); 
		} 
	} 
      
	
	
	
	static void rotateMatrix(int n) 
	{

		

	}
	// Driver code 
	public static void main(String args[]) 
	{ 
		//int n = 4;
		
		 
    if( n%2==0)
    {//  print a n x n spiral matrix in O(1) space 
		printSpiral(n); 
    }
    else {
    	rotateMatrix(n) ;
          }
	} 
} 