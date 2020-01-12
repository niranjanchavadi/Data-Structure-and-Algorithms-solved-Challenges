class PartPalindrome
{
	// Bottom-up DP function to mark if String X[i..j] is a palindrome
	// or not for all possible values of i and j
	public static void findAllPalindromes(String X, boolean[][] isPalin)
	{
		for (int i = X.length() - 1; i >= 0; i--)
		{
			for (int j = i; j < X.length(); j++)
			{
				if (i == j) {
					isPalin[i][j] = true;
				}
				else if (X.charAt(i) == X.charAt(j)) {
					isPalin[i][j] = ((j - i == 1) ? true : isPalin[i + 1][j - 1]);
				}
				else {
					isPalin[i][j] = false;
				}
			}
		}
	}

	// Iterative function to find the minimum cuts needed in a String
	// such that each partition is a palindrome
	public static int minPalinPartition(String X, boolean[][] isPalin)
	{
		// create a lookup table to store solutions of sub-problems
		// lookup[i] stores the minimum cuts needed in subString X[i..n)
		int[] lookup = new int[X.length()];

		// start from String's end
		for (int i = X.length() - 1; i >= 0; i--)
		{
			lookup[i] = Integer.MAX_VALUE;

			// if X[i...n-1] is a palindrome, total cuts needed is 0
			if (isPalin[i][X.length()-1]) {
				lookup[i] = 0;
			}
			else {
				// else find lookup[i]
				for (int j = X.length() - 2; j >= i; j--) {
					if (isPalin[i][j]) {
						lookup[i] = Integer.min(lookup[i], 1 + lookup[j + 1]);
					}
				}
			}
		}

		return lookup[0];
	}

	// main function
	public static void main(String[] args)
	{
		String X = "BABA";	 // BAB|ABCBA|D|C|EDE

		// isPalin[i][j] stores if subString X[i][j] is palindrome or not
		boolean[][] isPalin = new boolean[X.length() + 1][X.length() + 1];

		// find all subStrings of X that are palindromes
		findAllPalindromes(X, isPalin);

		System.out.println("The minimum cuts required are "
							+ minPalinPartition(X, isPalin));
	}
}