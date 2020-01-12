import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Numberseries1 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner (System.in);
		System.out.println("enter the n");
		//int n = scan.nextInt();
		int n =6;
		int c =n;
		
		for (int i=1;i<n;i++) 
		{
			
			
			for (int j=n ; j>0;j--)
			{
				System.out.print(c);
				
				c--;
		
			}
		
			System.out.println();
			c=c+10;
		}
		

	}

}
