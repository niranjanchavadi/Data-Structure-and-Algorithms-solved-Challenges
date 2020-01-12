package Recurssion;

import java.util.Arrays;

public class RecBnary {
	
	public static int recbanar(int a[],int left ,int right,int key)
	{
		//base condition
		Arrays.sort(a);
		if(left>right) {
		return -1;}
		
		int mid = left+right/2;
		
		if (key==a[mid]) {
			return mid;}
		
		if (key>a[mid]) {
			return recbanar(a,mid+1,right,key);
			}
		
		else
		{
			return recbanar(a,left,mid-1,key);
		}
			
	}
	
		
		
	

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int a []= {67,8735,9385,583085,634,698,7390,3957893};
		int key = 3957893;
		int left = 0;
		int right = a.length-1;
		System.out.println(recbanar(a, left, right, key));

	}

}
