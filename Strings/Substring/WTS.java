package Substring;

public class WTS {
	
	
	
	public static String reverseString (String s)
	{
		if(s.isEmpty())
		return s;
		
		return reverseString(s.substring(1))+s.charAt(0);
	}

	public static void main(String[] args) {
	
		String s = "Ragava is great person walliball";
		String rev = reverseString(s);
		System.out.println(rev);
	}

}
