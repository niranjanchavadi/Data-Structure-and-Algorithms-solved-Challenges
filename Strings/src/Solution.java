import java.util.*;

public class GetPalindrome {

	public static String getPalindromeIfPresent(String s) {

		// Basic validation
		if (s == null || s.length() < 2 || s.equals("") ) {
		    return null;
		}
		Map<Character, Integer> mapChars = new HashMap<Character, Integer>();

		char[] chars = s.toCharArray();

		// Build map of each char and count occurences in String
		for (int i = 0; i < chars.length; i++) {
		    if (mapChars.containsKey(chars[i])) {
		        Integer val = mapChars.get(chars[i]);
		        mapChars.put(chars[i], val+1);
		    } else {        
		        mapChars.put(chars[i], 1);    
		    }
		}

		// Validate String if possible to form palindrome rule is:
		// must have all chars count even, except middle char which can be odd
		int oneCharCount = 0;
		for (Map.Entry<Character, Integer> entry : mapChars.entrySet()) {
		    if (entry.getValue() % 2 != 0) {
		        oneCharCount++;
		            
		        if (oneCharCount > 1) {
		            return null;
		        }
		    }
		}

		int sLen = s.length();
		int middle = sLen/2;   
		Character midChar = null;
		StringBuilder s1 = new StringBuilder();

		// rearrange each group of chars distributing them at the start and end of string 
		for (Map.Entry<Character, Integer> entry : mapChars.entrySet()) {
		    int charCount = entry.getValue();
		    Character c = entry.getKey();
		    
		    if (charCount % 2 != 0) {
		        midChar = c;
		    }
		    
		        int i = charCount / 2;
		        while (i > 0) {
		           s1.append(c);
		           s1.insert(0, c);
		           i--;
		        }                              
		}

		// if middle Char exists from odd count, place it otherwise ignore
		if (midChar != null) {
			s1.insert(middle, midChar);	
		}

		return s1.toString();
    }
	
    public static void main(String[] args) {
    	String test = "xyy";
    	System.out.println(getPalindromeIfPresent(test));

    	//String test2a = "bbaa";
    	//System.out.println(getPalindromeIfPresent(test2a));

    	//String test2 = "nvreeodorevdne";
    	//System.out.println(getPalindromeIfPresent(test2));

    	//String test3 = "earth1earth";
    	//System.out.println(getPalindromeIfPresent(test3));
    }
}
