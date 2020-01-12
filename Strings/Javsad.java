import java.util.Scanner;
class Javsad  
{
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner (System.in);
	String s = scan.nextLine().replaceAll(" ","");
	for(int i=0;i<s.length();i++)
    {
	boolean flag = true;
	for (int j=0;j<s.length();j++)
      {
		if (i!=j && s.charAt(i)==s.charAt(j))
		{
			flag =false;
		}
	  }
	    
		if (flag)
		{
			System.out.print(s.charAt(i)+" ");
		}




		}

	}
}
