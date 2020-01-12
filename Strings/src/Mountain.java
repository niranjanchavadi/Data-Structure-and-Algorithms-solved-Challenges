import java.util.Scanner;

public class Mountain {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number n");
		int n = scan.nextInt();
		for(int i=0;i<n ;i++)
		{    //1
			for( int j=0;j<=n ;j++)
			{
				if (j<n-i)
				{
					System.out.print(" ");	
				}
			
			}
			
			//2
			for( int j=0;j<=n ;j++)
			{
				if (j<=i)
				{
					System.out.print("8");	
				}
			
			}
			//3
			for( int j=1;j<=n-1 ;j++)
			{
				if (j<=i)
				{
					System.out.print("8");	
				}
			
			}
			//4
			for( int j=1;j<=n ;j++)
			{
				if (j<n-i)
				{
					System.out.print(" ");	
				}
			
			}
			//5
			for( int j=1;j<=n ;j++)
			{
				if (j<n-i)
				{
					System.out.print(" ");	
				}
			
			}
			
			
			//6
			for( int j=0;j<=n ;j++)
			{
				if (j<=i)
				{
					System.out.print("8");	
				}
			
			}
			//7
			for( int j=1;j<=n-1 ;j++)
			{
				if (j<=i)
				{
					System.out.print("8");	
				}
			
			}
			
			
			//8
			for( int j=1;j<=n ;j++)
			{
				if (j<n-i)
				{
					System.out.print(" ");	
				}
			
			}
			//9
			for( int j=1;j<=n ;j++)
			{
				if (j<n-i)
				{
					System.out.print(" ");	
				}
			
			}
			//10
			for( int j=0;j<=n ;j++)
			{
				if (j<=i)
				{
					System.out.print("8");	
				}
			
			}
			//11
			for( int j=1;j<=n ;j++)
			{
				if (j<=i)
				{
					System.out.print("8");	
				}
			
			}
			
			
			
			
			System.out.println();
		}
	}

}
