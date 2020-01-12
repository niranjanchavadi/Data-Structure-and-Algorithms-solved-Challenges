import java.util.Arrays;

class Main
{
	// Function to merge X[0..m] and Y[0..n] to X[0..m+n+1]
	private static void merge(int[] X, int[] Y, int m, int n)
	{
		// size of X[] is (k+1)
		int k = m + n + 1;

		// run till X[] or Y[] has elements left
		while (m >= 0 && n >= 0)
		{
			// put next greater element in next free position in X[]
			// from end
			if (X[m] > Y[n]) {
				X[k--] = X[m--];
			} else {
				X[k--] = Y[n--];
			}
		}

		// copy remaining elements of Y[] (if any) to X[]
		while (n >= 0) {
			X[k--] = Y[n--];
		}

		// fill Y[] with all zeroes
		Arrays.fill(Y, 0);
	}

	// The function moves non-empty elements in X[] in the
	// beginning and then merge it with Y[]
	public static void rearrange(int[] X, int[] Y)
	{
		// moves non-empty elements of X[] in the beginning
		int k = 0;
		for (int i = 0; i < X.length; i++) {
			if (X[i] != 0) {
				X[k++] = X[i];
			}
		}

		// merge X[0..k-1] and Y[0..n-1] to X[0..m-1]
		merge(X, Y, k - 1, Y.length - 1);
	}

	// main function
	public static void main (String[] args)
	{
		// vacant cells in X[] is represented by 0
		int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0};
		int[] Y = { 1, 8, 9, 10, 15 };

		// validate input before calling rearrange()
		// 1. Both arrays X[] and Y[] should be sorted (ignore 0's in X[])
		// 2. size of array X[] >= size of array Y[] (i.e. m >= n)
		// 3. Number of vacant cells in array X[] = size of array Y[]

		// merge Y[] in X[]
		rearrange(X, Y);

		// print merged array
		System.out.println(Arrays.toString(X));
	}
}