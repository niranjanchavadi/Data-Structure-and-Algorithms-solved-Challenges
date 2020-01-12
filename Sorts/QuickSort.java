import java.util.Arrays;

public class QuickSort {
		
	public static void quicksort (int a[])
	{
		quickSortHelper(a,0,a.length-1);
		
	}
		
	public static void quickSortHelper(int[] a, int start, int end) {
		
		//base condition
		if (start>=end)
		{
			return;
		}
		
		int pivot = partion(a, start, end);
		quickSortHelper(a, start, pivot-1);
		quickSortHelper(a, pivot+1, end);
	}



	public static int partion(int[] a, int start, int end) {
		
		int pivot =a[end];
		int pindex = start;
		for (int i=start;i<end;i++)
		{
			if (a[i]<=pivot) {
				swap(a,i,pindex);
				
				pindex++;
			}
			
		}
		
		swap(a,end,pindex);
		
		return pindex ;
	}



	private static void swap(int[] a, int i, int j) {
		
		int temp =a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}



	public static void main(String[] args) {		
		int a []= {1,3,4,7,8,6,2,5};
		quicksort (a);	
		System.out.println(Arrays.toString(a));
	}

}
