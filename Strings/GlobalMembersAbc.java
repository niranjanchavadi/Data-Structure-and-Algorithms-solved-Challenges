import java.util.*;
import java.util.Map.Entry;

public class GlobalMembersAbc
{
	// C++ program to find out if string follows 
	// a given pattern or not 

	/* Function to find out if string follows a given 
		pattern or not 
	
		str - given string 
		n - length of given string 
		i - current index in input string 
		pat - given pattern 
		m - length of given pattern 
		j - current index in given pattern 
		map - stores mapping between pattern and string */
	public static boolean patternMatchUtil(String str, int n, int i, String pat, int m, int j, HashMap<Byte, String> map)
	{
		// If both string and pattern reach their end 
		if (i == n && j == m)
		{
			return true;
		}

		// If either string or pattern reach their end 
		if (i == n || j == m)
		{
			return false;
		}

		// read next character from the pattern 
		byte ch = (byte) pat.charAt(j);

		// if character is seen before 
		if (map.containsKey(ch))
		{
			String s = map.get(ch);
			int len = s.length();

			// consider next len characters of str 
			String subStr = str.substring(i, i + len);

			// if next len characters of string str 
			// don't match with s, return false 
			if (subStr.compareTo(s)!=0)
			{
				return false;
			}

			// if it matches, recurse for remaining characters 
			return patternMatchUtil(str, n, i + len, pat, m, j + 1, map);
		}

		// If character is seen for first time, try out all 
		// remaining characters in the string 
		for (int len = 1; len <= n - i; len++)
		{
			// consider substring that starts at position i 
			// and spans len characters and add it to map 
			map.put(ch, str.substring(i, i + len));

			// see if it leads to the solution 
			if (patternMatchUtil(str, n, i + len, pat, m, j + 1, map))
			{
				return true;
			}

			// if not, remove ch from the map 
			map.remove(ch);
		}

		return false;
	}

	// A wrapper over patternMatchUtil()function 
	public static <auto> boolean patternMatch(String str, String pat, int n, int m)
	{
		if (n < m)
		{
		return false;
		}

		// create an empty hashmap 
		HashMap<Byte,String> map = new HashMap<Byte, String>();

		// store result in a boolean variable res 
		boolean res = patternMatchUtil(str, n, 0, pat, m, 0, map);

		// if solution exists, print the mappings 
//C++ TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java:
		for (Entry<Byte, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		// return result 
		return res;
	}

	// Driver code 
	public static int Main()
	{
		String str = "GeeksforGeeks";
		String pat = "GfG";

		int n = str.length();
		int m = pat.length();

		if (!patternMatch(str, pat, n, m))
		{
			System.out.print("No Solution exists");
		}

		return 0;
	}
}