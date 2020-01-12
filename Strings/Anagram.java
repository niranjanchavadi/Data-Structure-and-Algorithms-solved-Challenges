import java.util.*;
class Anagram 
{
	public static void main(String[] args) 
	{
		String a,b="";
       
		String c,d="";
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the string a ");
		a = scan.nextLine().toUpperCase();
		char  y [] = a.toCharArray();
		System.out.println("Enter the string c");
        c = scan.nextLine().toUpperCase();
        char  z [] = c.toCharArray();
        for (int i=0;i<a.length() ;i++ )
        {
			if (y[i]>='A'&& y[i]<='Z')
			{
				b+=a.charAt(i);
			}
			
        }

        for (int i=0;i<c.length() ;i++ )
        {
        	
        	if (z[i]>='A'&& z[i]<='Z')
			{
				d+=c.charAt(i);
			}
        }

        if(b.length()==d.length())
        {
        	System.out.println("anagram");
        	
        }
        else
        {
        	System.out.println("not");	
        }

	}
}