
class Main5
{
	// Recursive function to check if str[low..high] is a palindrome or not
	public static boolean isPalindrome(String str, int low, int high)
	{
		return (low >= high) || (str.charAt(low) == str.charAt(high) &&
								isPalindrome(str, low + 1, high - 1));
	}

	// Function to check if given string is a rotated palindrome or not
	public static boolean isRotatedPalindrome(String str)
	{
		// length of the given string
		int m = str.length();

		// check for all rotations of the given string if it
		// is palindrome or not
		for (int i = 0; i < m; i++)
		{
			// in-place rotate the string by 1 unit
			str = str.substring(1) + str.charAt(0);

			// return true if the rotation is a palindrome
			if (isPalindrome(str, 0, m - 1)) {
				return true;
			}
		}

		// return false if no rotation is a palindrome
		return false;
	}

	// Check if given string is a rotated palindrome or not
	public static void main(String[] args) {
		// palindromic string
		String str = "xxxyy";

		// rotate it by 2 units
		str = str.substring(2) + str.substring(0, 2);

		if (isRotatedPalindrome(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}


