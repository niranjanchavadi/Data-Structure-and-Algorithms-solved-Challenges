import java.util.Scanner;

public class AP {

	private static final int alphabet = 65;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the number");
		//int n = scan.nextInt(); 
		int n =3;
		for (int i=0;i<n;i++)
		{
			
			for (int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
		
			for (int j=1;j<n-i;j++)
			{
				System.out.print((char) (alphabet + j-1) );
			}
			for (int j=0;j<n-i;j++)
			{
				System.out.print((char) (alphabet + j) );
			}
			
			
			
			System.out.println();
		}

	}

}
