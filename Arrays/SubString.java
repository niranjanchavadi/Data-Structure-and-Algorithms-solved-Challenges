class Main
{
	// Function to print all non-empty sub-strings of the specified String
	public static void printallSubStrings(String str)
	{
		int n = str.length();

		// consider all sub-strings starting from i
		for (int i = 0; i < n; i++) {
			// consider all sub-strings ending at j
			for (int j = i; j < n; j++) {
				System.out.print("'" + str.substring(i, j + 1) + "', ");
			}
		}
	}

	// Program to print all non-empty sub-strings of the specified String
	public static void main(String[] args)
	{
		String str = "techie";
		printallSubStrings(str);
	}
}