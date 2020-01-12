//import java.util.Scanner;

public class P {
	
	public static void main(String[] args)
    {
        // Create a new Scanner object
		//Scanner scanner = new Scanner(System.in);
        //int rows=scanner.nextInt();
        // Get the number of rows from the user
      //  System.out.println("Enter the number of rows to print the pattern ");
	
        
		
	int k =1;
	
    	int n =2;
		for (int i=0;i<n;i++)
		{
			
			for (int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
	
			for (int j=1;j<n-i+1;j++)
			{
				System.out.print(k++);
			}
			
           k=n-i-1;
           if(k==1)
           {
        	   k+=2;
           }
           
           for (int j=2;j<=n-i;j++)
			{
        	   
				System.out.print(j);
			}
			System.out.println();
		}
	
	
			
			
		
    }
}
