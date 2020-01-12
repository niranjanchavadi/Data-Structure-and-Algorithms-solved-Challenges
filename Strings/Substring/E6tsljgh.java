package Substring;

import java.util.HashSet;
import java.util.Set;


public class E6tsljgh {

	public static void main(String[] args) {
		String s= "Ragava is great person Volleyball";
		Set<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder(); 
	 	for (int i =0;i<s.length();i++)
		{
	      Character c = s.charAt(i);
			if (!set.contains(c)&&s.charAt(i)!=' ')
			{
			    set.add(c);
				sb.append(c);
			}
			if(c==' ') {
				sb.append(c);
				set.clear();
			}
		}
		
		String udl = sb.toString();
		sb.setLength(0);
		String df []= udl.split(" "); 
		String str []= s.split(" "); 
		
		for(int i=0,j=0;i<df.length&&j<str.length;i++,j++)
		{
			char c []= df[i].toCharArray(); 
			char b []= str[j].toCharArray(); 
			if (c.length==b.length)
			{
				System.out.print(b);
				System.out.print(" ");
				
			}
			else {
				
				  sb.append(b);
				  System.out.print(sb.reverse()+" ");
				  sb.setLength(0);
				
			      }
			}
		System.out.println();
		System.out.print(s);
			
		}
	}
			
		

		
	


