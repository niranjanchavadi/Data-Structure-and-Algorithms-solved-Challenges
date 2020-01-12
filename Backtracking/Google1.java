
 

 
import java.util.*; 

public class Google1
{ 
	// Function to return a vector that contains 
	// all the generated letter combinations 
	static ArrayList<String> letterCombinationsUtil(int[] number, int n, 
															String[] table) 
	{ 
			// To store the generated letter combinations 
			ArrayList<String> list = new ArrayList<>(); 
			
			Queue<String> q = new LinkedList<>(); 
			q.add(""); 
		
			while(!q.isEmpty()) 
			{ 
					String s = q.remove(); 

					// If complete word is generated 
					// push it in the list 
					if (s.length() == n) 
					list.add(s); 
					else
					{ 
						String val = table[number[s.length()]]; 
						for (int i = 0; i < val.length(); i++) 
						{ 
							q.add(s + val.charAt(i)); 
						} 
					} 
			} 
			return list; 
	} 

	// Function that creates the mapping and 
	// calls letterCombinationsUtil 
	static void letterCombinations(int[] number, int n) 
	{ 
			// table[i] stores all characters that 
			// corresponds to ith digit in phone 
			String[] table = { "", "", "abc", "def", "ghi", "jkl", 
			"mno", "pqrs", "tuv", "wxyz" }; 

			ArrayList<String> list = 
						letterCombinationsUtil(number, n, table); 
			
			// Print the contents of the list 
			for (int i = 0; i < list.size(); i++) 
			{ 
				System.out.print(list.get(i) + " "); 
			} 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
			int[] number = { 2, 3 }; 
			int n = number.length; 
			letterCombinations(number, n); 
	} 
} 

//This code is contributed by rachana soma 

