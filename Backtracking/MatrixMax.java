import java.util.Arrays;

class Main
{
	// Function to find maximum value of the expression
	// (A[l] - A[k] + A[j] - A[i]) where l > k > j > i
	public static int maximizeExpression(int[] A)
	{
		// create 4 lookup tables and initialize them to Integer.MIN_VALUE
		int[] L1 = new int[A.length + 1];
		Arrays.fill(L1, Integer.MIN_VALUE);

		int[] L2 = new int[A.length];
		Arrays.fill(L2, Integer.MIN_VALUE);

		int[] L3 = new int[A.length - 1];
		Arrays.fill(L3, Integer.MIN_VALUE);

		int[] L4 = new int[A.length - 2];
		Arrays.fill(L4, Integer.MIN_VALUE);

		// L1[] stores the maximum value of A[l]
		for (int i = A.length - 1; i >= 0; i--) {
			L1[i] = Integer.max(L1[i + 1], A[i]);
		}

		// L2[] stores the maximum value of A[l] - A[k]
		for (int i = A.length - 2; i >= 0; i--) {
			L2[i] = Integer.max(L2[i + 1], L1[i + 1] - A[i]);
		}

		// L3[] stores the maximum value of A[l] - A[k] + A[j]
		for (int i = A.length - 3; i >= 0; i--) {
			L3[i] = Integer.max(L3[i + 1], L2[i + 1] + A[i]);
		}

		// L4[] stores the maximum value of A[l] - A[k] + A[j] - A[i]
		for (int i = A.length - 4; i >= 0; i--) {
			L4[i] = Integer.max(L4[i + 1], L3[i + 1] - A[i]);
		}

		// maximum value would be present at L4[0]
		return L4[0];
	}

	// main function
	public static void main(String[] args)
	{
		int[] A = { 3, 9, 10, 1, 30, 40 };

		// array should have atleast 4 elements
		if (A.length >= 4) {
			System.out.println(maximizeExpression(A));
		}
	}
}
