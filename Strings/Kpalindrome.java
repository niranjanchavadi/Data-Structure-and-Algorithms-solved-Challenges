// A Naive recursive Java program 
// to find if given string is 
// K-Palindrome or not 
class Kpalindrome
{ 

	// find if given string is 
	// K-Palindrome or not 
	static int isKPalRec(String str1, 
			String str2, int m, int n) 
	{ 
		// If first string is empty, 
		// the only option is to remove 
		// all characters of second string 
		if (m == 0) 
		{ 
			return n; 
		} 

		// If second string is empty, 
		// the only option is to remove 
		// all characters of first string 
		if (n == 0) 
		{ 
			return m; 
		} 

		// If last characters of two 
		// strings are same, ignore 
		// last characters and get 
		// count for remaining strings. 
		if (str1.charAt(m - 1) == 
			str2.charAt(n - 1)) 
		{ 
			return isKPalRec(str1, str2, 
							m - 1, n - 1); 
		} 

		// If last characters are not same, 
		// 1. Remove last char from str1 and 
		// recur for m-1 and n 
		// 2. Remove last char from str2 and 
		// recur for m and n-1 
		// Take minimum of above two operations 
		return 1 + Math.min(isKPalRec(str1, str2, m - 1, n), // Remove from str1 
				isKPalRec(str1, str2, m, n - 1)); // Remove from str2 
	} 

	// Returns true if str is k palindrome. 
	static boolean isKPal(String str, int k) 
	{ 
		String revStr = str; 
		revStr = reverse(revStr); 
		int len = str.length(); 

		return (isKPalRec(str, revStr, len, len) <= k * 2); 
	} 

	static String reverse(String input) 
	{ 
		char[] temparray = input.toCharArray(); 
		int left, right = 0; 
		right = temparray.length - 1; 

		for (left = 0; left < right; left++, right--) 
		{ 
			// Swap values of left and right 
			char temp = temparray[left]; 
			temparray[left] = temparray[right]; 
			temparray[right] = temp; 
		} 
		return String.valueOf(temparray); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String str = "acdcb"; 
		int k = 2; 
		if (isKPal(str, k)) 
		{ 
			System.out.println("Yes"); 
		} 
		else
		{ 
			System.out.println("No"); 
		} 
	} 
} 

// This code is contributed by Rajput-Ji 
