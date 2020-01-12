import java.util.*;
class Vowels  
{
	public static void main(String[] args) 
	{
		//Scanner scan = new Scanner(System.in);
         //System.out.println("enter the String");
        //String s = scan.nextLine().toUpperCase();
		String s = "abc6e?ee??4fd";
		char y [] = s.toCharArray();
		int size = y.length;
		int ap=0;
		int sum=0;
		int spl=0;
		 for(int i = 0; i <= size-1; i++)
		{
			if (y[i]>='A'&& y[i]<='Z')
			{
				++ap;
			}
          
			else  
			  { if (y[i]=='?')
				  {
			          ++spl;
			           if(spl==3)
				       {
				             for( i = 0; i <= size-1; i++) {
		                     if(Character.isDigit(s.charAt(i))) {
		                      sum = sum + Integer.parseInt(s.charAt(i) + "");} }
			            }
				    }
		       }

           

		}

		System.out.println(sum==10&&spl==3);
		

      // System.out.println(y);
      //System.out.println(sum);
      // System.out.println(ap);
       //System.out.println(spl);



	}
}
