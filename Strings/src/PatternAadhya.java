import java.util.Scanner;

public class PatternAadhya  {

		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter the number n");
			int n =scan.nextInt();
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if  ( i==0 && j!=0 && j<=n/2 && j!=1&& j!=n/2 && j!=(n/2)-1
						  || i==n/2 && j<=n/2 
						  || j==0  && i!=0 
						  || j==n/2 && i!=0  
							)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				
				
				     for(int j=0;j<1;j++)
					 {  System.out.print(" ");}
					
				     for(int j=0;j<n;j++)
						{
							if  ( i==0 && j!=0 && j<=n/2 && j!=1 && j!=n/2 && j!=(n/2)-1
								  || i==n/2 && j<=n/2 
								  || j==0  && i!=0 
								  || j==n/2 && i!=0 
									)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
							
						}
						
				     for(int j=0;j<1;j++)
					 {  System.out.print(" ");}
					
				     for(int j=0;j<n;j++)
						{
							if  ( i==0 &&  j<=n/2  && j!=n/2 && j!=(n/2)-1
								  || i==n-1 && j<=n/2  && j!=n/2 && j!=(n/2)-1 
								  || j==0  && i!=0 
								  || j==n/2 && i!=0 && i!=n-1 
									)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
							
						}
						
				     for(int j=0;j<1;j++)
					 {  System.out.print(" ");}
					
				     for(int j=0;j<n;j++)
						{
							if  ( 
								   i==n/2 && j<=n/2 
								  || j==0  
								  || j==n/2 
									)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
							
						}
				     
				     
				     for(int j=0;j<1;j++)
					 {  System.out.print(" ");}
					
				     for(int j=0;j<n;j++)
						{
							if  ( i==j && i<n/2 
									||i+j==n-1 
									)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
							
						}
				     

				     for(int j=0;j<3;j++)
					 {  System.out.print(" ");}
				     
				     for(int j=0;j<n;j++)
						{
							if  ( i==0 && j!=0 && j<=n/2 && j!=1&& j!=n/2 && j!=(n/2)-1
								  || i==n/2 && j<=n/2 
								  || j==0  && i!=0 
								  || j==n/2 && i!=0  
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
			


		

