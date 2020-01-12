class CoinsDenomination
{	
	// Function to find the total number of ways to get change of N from
	// unlimited supply of coins in set S
	public static int count(int[] S, int N)
	{
		// if total is 0, return 1
		if (N == 0) {
			return 1;
		}

		// return 0 if total become negative
		if (N < 0) {
			return 0;
		}

		// initialize total number of ways to 0
		int res = 0;

		// do for each coin
		for (int i = 0; i < S.length; i++)
		{
			// recur to see if total can be reached by including
			// current coin S[i]
			res += count(S, N - S[i]);
		}

		// return total number of ways
		return res;
	}

	// main function
	public static void main(String[] args)
	{
		// n coins of given denominations
		int[] S = { 1, 2, 3 };

		// Total Change required
		int N = 4;

		System.out.println("Total number of ways to get desired change is "
				+ count(S, N));
	}
}
