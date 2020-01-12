public class StringUtil
{
	// Function to check if X can be derived from Y by rotating it
	public static boolean check(String X, String Y)
	{
		int m;

		// if String lengths are different, they can't be
		// derived from each other
		if ((m = X.length()) != Y.length()) {
			return false;
		}

		// Invariant : At i'th iteration of this loop,
		// String X will be rotated by i units
		for (int i = 0; i < m; i++)
		{
			// left rotate String X by 1 unit
			X = X.substring(1) + X.charAt(0);

			// return true if X becomes equal to Y
			if (X.compareTo(Y) == 0) {
				return true;
			}
		}

		// return false if no rotation is matched
		return false;
	}

	public static void main(String[] args)
	{
		String X = "ABCD";
		String Y = "DABC";

		if (check(X, Y)) {
			System.out.println("Given Strings can be derived from each other");
		}
		else {
			System.out.println("Given Strings cannot be derived from each other");
		}
	}
}