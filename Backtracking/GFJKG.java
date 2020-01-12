// Java program to find the minimum number 
// sets with consecutive numbers and less than Y 
 

class GFJKG 
{ 

// Function to find the minimum number of shets 
static int minimumSets(String s, int y) 
{ 

	// Variable to count 
	// the number of sets 
	int cnt = 0; 
	int num = 0; 

	int l = s.length(); 
	boolean f = false; 

	// Iterate in the string 
	for (int i = 0; i < l; i++) { 

		// Add the number to string 
		num = num * 10 + (s.charAt(i)-'0' ); 

		// Mark that we got a number 
		if (num <= y) 
			f = true; 
		else // Every time it exceeds 
		{ 

			// Check if previous was 
			// anytime less than Y 
			if (f) 
				cnt += 1; 

			// Current number 
			num = s.charAt(i)-'0' ; 
			f = false; 

			// Check for current number 
			if (num <= y) 
				f = true; 
			else
				num = 0; 
		} 
	} 

	// Check for last added number 
	if (f == true) 
		cnt += 1; 

	return cnt; 
} 

// Driver Code 
public static void main(String args[]) 
{ 
	String s = "1234"; 
	int y =30; 
	System.out.println(minimumSets(s, y)); 
} 
} 
// This code is contributed by 
// Shashank_Sharma 
