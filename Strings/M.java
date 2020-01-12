import java.util.Scanner;

public class M {
	
	public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);
        //int rows=scanner.nextInt();
        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");
	
        
		
	int k =1;
	
    	int n =3;
		for (int i=0;i<n;i++)
		{
			
			
	
			for (int j=1;j<n+1;j++)
			{
				if(i<j)
				{ 
				
					System.out.print(k++);
				}
			}
			k=1;
	
			
			System.out.println();
		}
	
	
    }
}