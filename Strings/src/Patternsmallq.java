
 
import java.util.Scanner;

public class Patternsmallq  {

	public static void main(String[] args) {
		//Scanner scan = new Scanner (System.in);
		//System.out.println("Enter the number n");
		//int n =scan.nextInt();
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				if  ( i==0 && j<=5&& j>2
					||i==2 && j<=5&& j>2
					 ||i==1 && j<=6&& j>=2 && j!=3 && j!=4&& j!=5
					 || i==3 && j>0 && j<=4 && j!=2 && j!=3
					 || i==4 && j>0 && j<=2
					
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
		


	

