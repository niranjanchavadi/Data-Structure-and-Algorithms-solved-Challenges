class KswapsNumber
{
	private static void swap(char[] c, int i, int j) {
		char ch = c[i];
		c[i] = c[j];
		c[j] = ch;
	}

	// Find minimum number formed by doing at-most k swap operations upon
	// digits of string
	public static int findMinimum(char[] c, int n, int k, int minSoFar)
	{
		// get string from the char[] array
		String s = new String(c);

		// compare current number with minimum number so far
		if (s.compareTo(String.valueOf(minSoFar)) < 0) {
			minSoFar = Integer.valueOf(s);
		}

		// base case: no swaps left
		if (k < 1) {
			return minSoFar;
		}

		// do for each digit in the input string
		for (int i = 0; i < n - 1; i++)
		{
			// compare the current digit with remaining digits
			for (int j = i + 1; j < n; j++)
			{
				// if the digit at i'th index is more than the digit 
				// at j'th index
				if (c[i] > c[j])
				{
					// swap c[i] and c[j]
					swap(c, i, j);

					// recur for remaining k - 1 swaps
					minSoFar = findMinimum(c, n, k - 1, minSoFar);

					// backtrack - restore the array back
					swap(c, i, j);
				}
			}
		}
		return minSoFar;
	}

	public static void main(String[] args)
	{
		// input
		int i = 21;
		int k = 2;

		// convert digits of the given integer to a char array to
		// facilitate operations on them
		char[] ch = String.valueOf(i).toCharArray();
		int minimum = findMinimum(ch, ch.length, k, i);

		System.out.println("The minimum number formed by doing at-most "
								   + k + " swaps is " + minimum);
	}
}