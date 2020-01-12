package mATRIXspiral;

public class Spiral {

	// Java program to fill a matrix with values from 
	// 1 to n*n in spiral fashion. 
	
		static int MAX = 100; 

	// Fills a[m][n] with values from 1 to m*n in 
	// spiral fashion. 
		static void spiralFill(int m, int n, int a[][]) { 
			// Initialize value to be filled in matrix 
			int val = 1; 

			/* k - starting row index 
			m - ending row index 
			l - starting column index 
			n - ending column index */
			int k = 0, l = 0; 
			while (k < m && l < n) { 
				/* Print the first row from the remaining 
			rows */
				for (int i = l; i < n; ++i) { 
					a[k][i] = val++; 
				} 

				k++; 

				/* Print the last column from the remaining 
			columns */
				for (int i = k; i < m; ++i) { 
					a[i][n - 1] = val++; 
				} 
				n--; 

				/* Print the last row from the remaining 
			rows */
				if (k < m) { 
					for (int i = n - 1; i >= l; --i) { 
						a[m - 1][i] = val++; 
					} 
					m--; 
				} 

				/* Print the first column from the remaining 
			columns */
				if (l < n) { 
					for (int i = m - 1; i >= k; --i) { 
						a[i][l] = val++; 
					} 
					l++; 
				} 
			} 
		} 

		/* Driver program to test above functions */
		public static void main(String[] args) { 
			int m = 4, n = 4; 
			int a[][] = new int[MAX][MAX]; 
			spiralFill(m, n, a); 
			for (int i = 0; i < m; i++) { 
				for (int j = 0; j < n; j++) { 
					System.out.print(a[i][j] + " "); 
				} 
				System.out.println(""); 
			} 
		} 
	} 

	/* This Java code is contributed by PrinciRaj1992*/

