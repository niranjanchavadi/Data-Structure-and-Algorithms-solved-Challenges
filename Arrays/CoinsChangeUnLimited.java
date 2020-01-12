public class CoinsChangeUnLimited
{
	// Function to find the minimum number of coins required
	// to get total of N from set S
	public static int findMinCoins(int[] S, int N)
	{
		// if total is 0, no coins are needed
		if (N == 0) {
			return 0;
		}

		// return INFINITY if total become negative
		if (N < 0) {
			return Integer.MAX_VALUE;
		}

		// initialize minimum number of coins needed to infinity
		int coins = Integer.MAX_VALUE;

		// do for each coin
		for (int i = 0; i < S.length; i++)
		{
			// recur to see if total can be reached by including
			// current coin S[i]
			int res = findMinCoins(S, N - S[i]);

			// update minimum number of coins needed if choosing current
			// coin resulted in solution
			if (res != Integer.MAX_VALUE) {
				coins = Integer.min(coins, res + 1);
			}
		}

		// return minimum number of coins needed
		return coins;
	}

	public static void main(String[] args)
	{
		// n coins of given denominations
		int[] S = { 1, 3, 5, 7 };

		// Total Change required
		int N = 18;

		System.out.println("Minimum number of coins required to get desired change is "
				+ findMinCoins(S, N));
	}
}
