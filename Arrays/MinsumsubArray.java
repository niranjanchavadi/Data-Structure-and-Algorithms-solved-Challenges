
public class MinsumsubArray {
	
	
	
	public static void MinSubAray (int[] a, int k)
	{
		
		int wid_sum = 0;
		int min_valaue = Integer.MAX_VALUE;
		int last=0;
		
		for (int i=0;i<a.length;i++)
		{
			 wid_sum+= a[i];
		    if (i+1>=k)
		    {
		    	if (min_valaue>wid_sum)
		    	{
		    		min_valaue=wid_sum;
		    		last=i;
		    	}
                
		    	wid_sum-= a[i+1-k];
		    }
		    
			
		}
		
		System.out.print(last-k+1+" ");
		System.out.println(last);
	}
	

	public static void main(String[] args) {
		
	int a []= {10,4,2,5,6,3,8,1};
	int k=3;
	MinSubAray(a,k);

	}

}
