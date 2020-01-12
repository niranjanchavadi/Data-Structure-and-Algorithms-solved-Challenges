package InsertionSort;

import java.util.Arrays;

public class RecursionInsert {

	public static void insertionsort(int a [])
	{
		for (int i=1;i<a.length;i++)
		{
			int value = a[i];
			int j=i;
			
			while (j>0&&a[j-1]>value) 
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=value;
		}
		
	}
	public static void main(String[] args) {
		
		int a []= {6,8,3,4,5,9,5,5,58,8};
		int n = a.length;
		insertionsort(a);
		System.out.println(Arrays.toString(a));

	}

}
