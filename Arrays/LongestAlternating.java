class Main
{
	// Util function to find length of longest subsequence
	// if flag is true, next element should be greater
	// if flag is false, next element should be smaller
	public static int Util(int[] A, int start, int end, boolean flag)
	{
		int res = 0;
		for (int i = start; i <= end; i++)
		{
			// include A[i] as next high in subsequence and flip flag
			// for next subsequence
			if (flag && A[i - 1] < A[i]) {
				res = Integer.max(res, 1 + Util(A, i + 1, end, !flag));
			}
			// include A[i] as next low in subsequence and flip flag
			// for next subsequence
			else if (!flag && A[i - 1] > A[i]) {
				res = Integer.max(res, 1 + Util(A, i + 1, end, !flag));
			}
			// don't include A[i] in subsequence
			else {
				res = Integer.max(res, Util(A, i + 1, end, flag));
			}
		}

		return res;
	}

	// Function to find length of longest subsequence with alternate
	// low and high elements. It uses Util() method.
	public static int findLongestSequence(int[] arr)
	{
		// Fix first element and recur for remaining elements as first
		// element will always be part of longest subsequence (why?)

		// There are two possibilities -

		// 1. Next element is greater (pass true)
		// 2. Next element is smaller (pass false)
		return 1 + Integer.max(Util(arr, 1, arr.length - 1, true),
							Util(arr, 1, arr.length - 1, false));

		// instead of fixing first element, we can also directly call
		// return max(Util(arr, 0, n, true), Util(arr, 0, n, false));
	}

	// main function
	public static void main(String[] args)
	{
		int[] A = { 8, 9, 6, 4, 5, 7, 3, 2, 4 };

		System.out.println("The length of Longest Subsequence is "
				+ findLongestSequence(A));
	}
}
