package BinaryArray;

import java.util.Arrays;

public class SortbinaryArray {

  public static void sort(int a[])
  { 	int zer0 = 0;
        int k = 0;
	  for (int i=0;i<a.length;i++)
	  {
		if (a[i]==0)
		{
			
			zer0++;
		}
	 }
	  while (zer0--!=0)
	  {
		  
		a[k++]=0;
	  }
	  while(k<a.length)
	  {
		  a[k++]=1;
	  }
  }
	
  
  public static void main(String[] args) {
	int a []= {0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
	sort(a);

	System.out.println(Arrays.toString(a));
}
	
	
	
	
	
	
	
	
	
	
	

}
