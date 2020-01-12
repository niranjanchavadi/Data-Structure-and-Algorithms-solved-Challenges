import java.util.Scanner;

public class Mypattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number n");
		int n = scan.nextInt();
		for(int i=0;i<n ;i++)
		{
			for( int j=0;j<=n ;j++)
			{
				if (j<n-i)
				{
					System.out.print(" ");	
				}
				else {
				System.out.print("8");
				}
				
			}
			
			
			for( int j=0;j<n ;j++)
			{
				System.out.print("*");
			}
			
			for( int j=0;j<n ;j++)
			{
				
				if(i==n/2||j==n/2||i==n-1||j==n-1||i==0)
				{
					System.out.print("*");
				}
		 	
			else 
			{
				System.out.print(" ");
				
			}
			
			}
			for( int j=0;j<n ;j++)
			{
				
				if(i==j||i+j==n-1||i==n-1||j==n-1||i==0)
				{
					System.out.print("*");
				}
		 	
			else 
			{
				System.out.print(" ");
				
			}
			
			}
			for( int j=0;j<n ;j++)
			{
				System.out.print("*");
			}
			
			for( int j=0;j<=i ;j++)
			{
				System.out.print("8");
			}
			
			System.out.println();
		}

	}

}
