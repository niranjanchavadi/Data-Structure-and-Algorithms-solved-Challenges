
public class udl {

	public static void main(String[] args) {
		String s = "abca"; 
		char y []= s.toCharArray();
		permutation(y,0,y.length);
	}

	public static void permutation(char[] y, int i, int n) {
		
		if (i>=n)
		{
			System.out.println(y);
			return;
		}
		
		
		for (int j=i;j<n;j++)
		{
			
			boolean check = shouldPermute(y,i,j);		
			
			if (check)
			{
				swap(y, i, j);
				permutation(y, i+1, n);
				swap(y, i, j);
				
			}
		
		}
	
		
	}

	private static void swap(char[] y, int i, int n) {
	
	char c = y[i];
	y[i] = y [n];
	 y [n]=c;
		
	}

	private static boolean shouldPermute(char[] y, int i, int n) {

		for(int j=i;j<n;j++)
		{
			if (y[j]==y[n])
			{
				return false;
			}
		}
		
		return true;
	}

}
