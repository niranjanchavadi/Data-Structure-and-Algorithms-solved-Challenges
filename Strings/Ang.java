

import java.util.*;
class Ang 
{
	
	public static void main(String[] args ) 
	{
		boolean flag ;
		String a,b="";
		//a ="Mother ! in La_w".toUpperCase().replaceAll(" ", "");
		String c,d="";
		//c ="hiTl42ler woman".toUpperCase().replaceAll(" ", "");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the string a ");
		a = scan.nextLine().toUpperCase().replaceAll("\\s", ""); 
		char  y [] = a.toCharArray();
		System.out.println("Enter the string c");
        c = scan.nextLine().toUpperCase().replaceAll("\\s", ""); 
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

        if(b.length()!=d.length())
        {
        	
        flag = false;
        	
        }
        else
        { 
        	char n []  = b.toCharArray();  
            char m []  = d.toCharArray();  
            Arrays.sort(n);  
            Arrays.sort(m);  
             flag = Arrays.equals(n, m);  
        		
        }
        if (flag) 
        {  
            System.out.println( "ANAGRAM");  
        } 
        else
        {  
            System.out.println("NOT ANAGRAM");
        
               }
	}
}