package BinaryArray;

import java.util.Arrays;

public class TwoSum {
	
	public static void twosum (int a[],int sum)
	
	{
		int high = a.length-1;
		int low =0;
		Arrays.sort(a);
		while (low <high)
		{
			if (a[low]+a[high]==sum)
			{
				System.out.println(low + " "+ high);
				return;
			}
			else if (a[low]+a[high]>sum)
			{
				--high;
				
			}
			else
			{
				++low;
			}
			
		}
		System.out.println("no ");
		
	}
	


	
	public static void main(String[] args) {
		
		int a []= {2,7,11,15,55,12,3,9};
		int sum =9;
		
		twosum(a,sum);
		
		
	}

}
