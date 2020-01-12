
public class GJD {
	
	static boolean arraysEqual(int[] mymin,int n)
	{
		int left =0;
		int right =mymin.length-1;
		int mid = left+right/2;
		int leftsum =0;
		int rightsum =0;
		for (int i=left;i<mid-1;i++ )
		{  leftsum  =leftsum +mymin[i];
			
			for (int j=mid+1;j>=right;j++ )
			{
				rightsum =rightsum+mymin[j]; 
				
				if(leftsum<rightsum)
				{
					mid=mid-1;
				}
				else if(leftsum>rightsum)
				{
					mid=mid+1;
				}
				
				else if(leftsum==rightsum)
				{
					return true;
				}
			}
			
		}
			
		return false;	
		
	}
	
	public static void main(String[] args) {
		int[] mymin = {10,1,1,6,3,3,2,3,1};
		int n = mymin.length;
System.out.println(arraysEqual(mymin,n));
	}

}
