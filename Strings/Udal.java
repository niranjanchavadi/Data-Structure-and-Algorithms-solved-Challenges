import java.util.*;
class Udal 
{
	public static void main(String[] args) 
	{
		boolean flag;
      String a,b = "";
	  String c,d = "";
     Scanner scan = new Scanner(System.in);
     a = scan.nextLine().replaceAll(" ","").toUpperCase();
	 char y[] = a.toCharArray();
     c = scan.nextLine().replaceAll(" ","").toUpperCase();
     char z[] = c.toCharArray();

	 for (int i=0;i<a.length() ;i++ )
	 {
		 if (y[i]>='A'&& y[i]<='Z')
		 {
			 b += a.charAt(i);
		 }
	 }
 
      	 for (int i=0;i<c.length() ;i++ )
	 {
		 if (z[i]>='A'&& z[i]<='Z')
		 {
			 d += c.charAt(i);
		 }
	 }
 
        if (b.length()!=d.length())
        {
         flag =false;
        }
        else{
			

				char n [] =b.toCharArray();
                char m [] =d.toCharArray();

				Arrays.sort(n);
                Arrays.sort(m);
				flag = Arrays.equals(n,m);

			}
		
			
              if (flag)
              {
				  System.out.println("ANAGRAM");
              }
              else
		     {
				  System.out.println("NOT ANAGRAM");
			  }
		




		
	}
}
