package Mergesort;

import java.util.Arrays;

public class RecursionMergeSort {
	
	public static void main(String[] args) {
		int input [] = {87, 57, 370, 110, 90, 610, 02, 710, 140, 203, 150};
		
		 mergesort(input);
		 
		 System.out.println(Arrays.toString(input));
		
	}

	public static void mergesort(int[] input) {
		
		mergesort(input,0,input.length-1); 
		
	}

	private static void mergesort(int[] input, int start, int end) {
		
		int mid = (start+end)/2;
		if (start<end)
		{
			mergesort(input, start, mid);
			mergesort(input, mid+1, end);
		}
		
		int i=0,last=mid+1,first=start;
		int [] temp=new int [end-start+1];
		while (first<=mid &&last<=end)
		{
			if(input[first]>input[last]) {
				temp[i++]=input[last++];}
			else 
			{
				temp[i++]=input[first++];
			}
		}
		
		while (first<=mid)
		{
			temp[i++]=input[first++];
		}
		while (last<=end)
		{
			temp[i++]=input[last++];
		}
		i=0;
		while (start<=end)
		{
			input[start++]=temp[i++];
		}
	}
	
	
	
	
	
	
}