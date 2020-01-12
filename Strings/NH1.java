import java.util.Scanner; 
class NH1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System .in);
       System.out.println("Enter the String");
	    String as = scan.nextLine();
		String rev[]=as.split(" ");
		//System.out.println(as);
		for (int i=0;i<rev.length;i++ )
		{
			System.out.println(rev);
		}
	}
}
