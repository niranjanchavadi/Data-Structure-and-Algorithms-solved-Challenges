 package InsertionSort;

import java.util.Arrays;

public class Recursasioninsertion {
	
 public static void	recursionhelper(int[] a, int n, int i)
{
	 int value =a[i];
	 int j=i;
	 
	 while (j>0&&a[j-1]>value)
	 {
		 a[j]=a[j-1];
		 j--;
		 
	 }
      a[j]=value;
      if (i+1<=n)
      {
    	  recursionhelper(a, n, i+1);
      }
	 
	}

	
	
	
	
 public static void main(String[] args) {
	 
	 int a [] = {1,7,8,9,4,3,6};
	 int n =a.length-1;
	 int i =1;
	 recursionhelper(a,n,i);
	 System.out.println(Arrays.toString(a));
	
 }

	

 }
