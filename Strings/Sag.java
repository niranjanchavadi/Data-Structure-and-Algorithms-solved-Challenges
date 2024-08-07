import java.util.Map;

public class Sag {
	/*  Function to find out if string follows a given 
    pattern or not 
  
    str - given string 
    n - length of given string 
    i - current index in input string 
    pat - given pattern 
    m - length of given pattern 
    j - current index in given pattern 
    map - stores mapping between pattern and string */
static Boolean patternMatchUtil(String str, int n, int i, 
                    String pat, int m, int j, 
                    Map<Character, String> map) 
{ 
    // If both string and pattern reach their end 
    if (i == n && j == m) 
        return true; 
  
    // If either string or pattern reach their end 
    if (i == n || j == m) 
        return false; 
  
    // read next character from the pattern 
    char curr = pat.charAt(j);; 
  
    // if character is seen before 
    if (map.containsKey(curr))
    { 
    	String s = map.get(curr);
        int len = s.length(); 
  
        // consider next len characters of str 
        String subStr = str.substring(i, len); 
  
        // if next len characters of string str 
        // don't match with s, return false 
        if (subStr.compareTo(s)!=0) 
            return false; 
  
        // if it matches, recurse for remaining characters 
        return patternMatchUtil(str, n, i + len, pat, m, 
                                            j + 1, map); 
    } 
  
    // If character is seen for first time, try out all 
    // remaining characters in the string 
    for (int len = 1; len <= n - i; len++) 
    { 
        // consider substring that starts at position i 
        // and spans len characters and add it to map 
    	map.put(curr, str.substring(i, len));
  
        // see if it leads to the solution 
        if (patternMatchUtil(str, n, i + len, pat, m, 
                                          j + 1, map)) 
            return true; 
  
        // if not, remove ch from the map 
        map.remove(curr);; 
    } 
  
    return false; 
} 
  
// A wrapper over patternMatchUtil()function 
static boolean patternMatch(String str, String pat, int n, int m) 
{ 
    if (n < m) 
    return false; 
  
    // create an empty hashmap 
    Map<Character, String> map = null; 
  
    // store result in a boolean variable res 
    Boolean res = patternMatchUtil(str, n, 0, pat, m, 0, map); 
  
    // if solution exists, print the mappings 
    for (Map.Entry<Character, String> entry: map.entrySet()) {
		System.out.println(entry.getKey() + ": " + entry.getValue());
    }
	return res;
  
    // return result 
 
} 
  	public static void main(String[] args) {
		String str = "GeeksforGeeks", pat = "GfG"; 
		  
	    int n = str.length(), m = pat.length(); 
	  
	    if (!patternMatch(str, pat, n, m)) 
	      System.out.println("No Solution exists"); 
	  
	   

	}

}
