class BSslkh
{
	// Function to check if the given string is K-Palindrome or not
	public static int isKPalindrome(String X, int m, String Y, int n)
	{
		// if either string is empty, remove all characters from other string
		if (m == 0 || n == 0) {
			return n + m;
		}

		// ignore last characters of both strings if they are same
		// and recur for remaining characters
		if (X.charAt(m - 1) == Y.charAt(n - 1)) {
			return isKPalindrome(X, m - 1, Y, n - 1);
		}
		// if last character of both strings is different

		// remove last character from the first string and recur
		int x = isKPalindrome(X, m - 1, Y, n);

		// remove last character from the second string and recur
		int y = isKPalindrome(X, m, Y, n - 1);

		// consider minimum of above two operations plus one
		return 1 + Integer.min(x, y);
	}

	// main function
	public static void main(String[] args)
	{
		String str = "CABCBC";
		int K = 2;

		// get reverse of str
		String rev = new StringBuilder(str).reverse().toString();//CBCBAC

		if (isKPalindrome(str, str.length(), rev, str.length()) <= 2 * K) {
			System.out.print("String is K-Palindrome");
		} else {
			System.out.print("String is not a K-Palindrome");
		}
	}
}