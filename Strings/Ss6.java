import java.util.HashSet;
import java.util.Set;

public class Ss6 {
    public static Set<String> permutestring (String s )
    {
    	Set<String>perm = new HashSet<>();
		
    	if (s==null)
    	{
    		return null;
    	}
    	else if (s.length()==0)
    	{
    		perm.add("");
    		return perm;
    	}
    	char in = s.charAt(0);
    	String rem = s.substring(1);
    	Set<String> words = permutestring(rem);
    	for (String newstr : words)
    	{
    		for (int i=0;i<=newstr.length();i++)			
    		{
    			perm.add(characterInsert(newstr,in,i));
    			
    		}
    		
    	}
    	return perm;
    }
    
	public static String characterInsert(String s, char c, int j) {

		String begin = s.substring(0, j);
        String end = s.substring(j);
		
        return begin + c + end;
	}

	public static void main(String[] args) {
		
		String s = "abcc";
		System.out.println(permutestring(s));

	}

}
