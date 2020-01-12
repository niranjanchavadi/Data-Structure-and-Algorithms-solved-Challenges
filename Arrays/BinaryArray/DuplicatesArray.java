package BinaryArray;

public class DuplicatesArray {
	
	
	public static int findDuplicatesArray(int a[])
	{
		boolean visited [] = new boolean[a.length+1];
		
		for(int i=0 ;i<a.length;i++)
		{
			if(visited [a[i]]==true)
			{
				return a[i]=a[i]++;
			}
			
			visited[a[i]]= true;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		
   int a[]= {1,2,3,4,5,6,6,7,8,99,99};
  
   System.out.println("duplicates elements are "+findDuplicatesArray(a));

	}

	private static String tostring(int c) {
		// TODO Auto-generated method stub
		return null;
	}

}
