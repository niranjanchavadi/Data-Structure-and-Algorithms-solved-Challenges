class Main
{
	// Function to find best way to cut a rod of length n
	// where rod of length i has a cost price[i-1]
	public static int rodCut(int[] price, int n)
	{
		// base case
		if (n == 0) {
			return 0;
		}

		int maxValue = Integer.MIN_VALUE;

		// one by one partition the given rod of length n into two parts of length
		// (1, n-1), (2, n-2), (3, n-3), .... (n-1 , 1), (n, 0) and take maximum
		for (int i = 1; i <= n; i++)
		{
			// rod of length i has a cost price[i-1]
			int cost = price[i - 1] + rodCut(price, n - i);

			if (cost > maxValue) {
				maxValue = cost;
			}
		}

		return maxValue;
	}

	// main function
	public static void main(String[] args)
	{
		// length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int price [] = { 1, 5, 8, 9, 10, 17, 17, 20 };

		// rod length
		int n = 4;

		System.out.println("Profit is " + rodCut(price, n));
	}
}