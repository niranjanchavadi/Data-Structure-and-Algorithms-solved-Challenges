import java.util.Arrays;

class ThreePartitionProblem
{
	// Helper function for solving 3 partition problem
	// It return true if there exists three subsets with given sum
	public static boolean subsetSum(int[] S, int n, int a, int b, int c)
	{
		// return true if subset is found
		if (a == 0 && b == 0 && c == 0) {
			return true;
		}

		// base case: no items left
		if (n < 0) {
			return false;
		}

		// Case 1. current item becomes part of first subset
		boolean A = false;
		if (a - S[n] >= 0) {
			A = subsetSum(S, n - 1, a - S[n], b, c);
		}

		// Case 2. current item becomes part of second subset
		boolean B = false;
		if (!A && (b - S[n] >= 0)) {
			B = subsetSum(S, n - 1, a, b - S[n], c);
		}

		// Case 3. current item becomes part of third subset
		boolean C = false;
		if ((!A && !B) && (c - S[n] >= 0)) {
			C = subsetSum(S, n - 1, a, b, c - S[n]);
		}

		// return true if we get solution
		return A || B || C;
	}

	// Function for solving 3-partition problem. It return true if given
	// set S[0..n-1] can be divided into three subsets with equal sum
	public static boolean partition(int[] S)
	{
		if (S.length < 3) {
			return false;
		}

		// get sum of all elements in the set
		int sum = Arrays.stream(S).sum();

		// return true if sum is divisble by 3 and the set can can
		// be divided into three subsets with equal sum
		return (sum % 3) == 0 && 
				subsetSum(S, S.length - 1, sum/3, sum/3, sum/3);
	}

	// main function for 3-partition problem
	public static void main(String[] args)
	{
		// Input: set of integers
		int[] S = { 7, 3, 2, 1, 5, 4, 8 };

		if (partition(S)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}