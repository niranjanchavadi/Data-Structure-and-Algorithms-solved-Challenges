import java.util.Scanner;

class PatternJ
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number n");
		int n=s.nextInt();
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				if (j==n/2 && i!=n-1
					||i==n-1 && j!=n/2 && j<n/2
						)
				{
					System.out.print("*");
				}
			
			else
			{
				System.out.print(" ");
			}
			
		  }
			System.out.println();
		
		}	
		
		
		
		
		
		
  	
	
	}
	}