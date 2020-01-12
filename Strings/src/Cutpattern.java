import java.util.Scanner;

public class Cutpattern {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number n");
	int n = scan.nextInt();
		
		for(int i=0;i<n;i++)
		{   //1
			for(int j=0;j<n;j++){
			
			if(j<n-i)
			{
				System.out.print(" ");
			}
			
		                         }
			//2
			for(int j=0;j<n;j++){
				
				if(j<=i)
				{
					System.out.print("*");
				}
				
			                         }
			
			//3
			for(int j=1;j<n;j++){
				
				if(j<=i)
				{
					System.out.print("*");
				}
				
			                         }
			
			
			System.out.println();
		}
		
		for(int i=1;i<n;i++)
		{
			//1
			for(int j=0;j<n;j++){
			
			if(j<=i)
			{
				System.out.print(" ");
			}
			
		                         }
			//2
			for(int j=0;j<n;j++){
				
				if(j<n-i)
				{
					System.out.print("*");
				}
				
			                         }
			//3
			for(int j=1;j<n;j++){
				
				if(j<n-i)
				{
					System.out.print("*");
				}
				
			                         }
				
			
			
			System.out.println();
		}
		
		
		
		
		

	}

}
