import java.util.Scanner;

public class PatternQ {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number n");
		int n =scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if  (i==0 && j!=0 && j<3*n/4
					||i==3*n/4 && j!=0 && j<3*n/4&&j!=3*n/4	
					||j==0 && i!=0 && i<3*n/4
					||j==3*n/4 && i!=0 && i<3*n/4&& i!=3*n/4
					|| i==j && i>=n/2 && j!=3*n/4&&i!=3*n/4		
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
		


	

