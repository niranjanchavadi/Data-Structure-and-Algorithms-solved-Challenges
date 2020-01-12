class Main {

	// Recursive function to check if the input String matches
	// with a given wildcard pattern
	public static boolean isMatch(String str, int n, String pattern, int m)
	{
		// end of pattern is reached
		if (m == pattern.length())
		{
			// return true only if end of input String is also reached
			return n == str.length();
		}

		// if the input String reaches its end, return when the
		// remaining characters in the pattern are all '*'
		if (n == str.length())
		{
			for (int i = m; i < pattern.length(); i++) {
				if (pattern.charAt(i) != '*') {
					return false;
				}
			}

			return true;
		}

		// if current wildcard character is '?' or current character in
		// pattern is same as current character in the input String
		if (pattern.charAt(m) == '?' || pattern.charAt(m) == str.charAt(n))
		{
			// move to next character in the pattern and the input String
			return isMatch(str, n + 1, pattern, m + 1);
		}

		// if current wildcard character is '*'
		if (pattern.charAt(m) == '*')
		{
			// move to next character in the input String or
			// ignore '*' and move to next character in the pattern
			return isMatch(str, n + 1, pattern, m) ||
							isMatch(str, n, pattern, m + 1);
		}

		// we reach here when current character in the pattern is not a
		// wildcard character and it doesn't matches with the current
		// character in the input String
		return false;
	}

	// Check if a String matches with a given wildcard pattern
	public static boolean isMatch(String str, String pattern) {
		return isMatch(str, 0, pattern, 0);
	}

	public static void main(String[] args)
	{
		System.out.println(isMatch("XYXZZXY", "X***Y"));	// true
		System.out.println(isMatch("XYXZZXY", "X*ZZ??"));   // true
		System.out.println(isMatch("XYXZZXY", "*X*X?"));	// true
		System.out.println(isMatch("XYXZZXY", "X***X"));	// false
		System.out.println(isMatch("XYXZZXY", "*"));		// true
	}
}