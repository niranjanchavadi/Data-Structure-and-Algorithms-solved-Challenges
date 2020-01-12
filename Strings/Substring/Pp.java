package Substring;

public class Pp {
	
	
	
	
	public static  int minCut (String s)
	{
		int dp [] =new int [s.length()+1];
		for (int i=0;i<=s.length();i++) dp[i]=i-1;
		for (int i=0;i<s.length();i++) {
			for (int j=i,k=i;j>=0&&k<s.length()&&s.charAt(j)==s.charAt(k);j--,k++)
			{	dp[k+1]=Math.min(dp[k+1], dp[j]+1);}
		for (int j=i,k=i+1;j>=0&&k<s.length()&&s.charAt(j)==s.charAt(k);j--,k++)
		{	dp[k+1]=Math.min(dp[k+1], dp[j]+1);}

		}
		
	
		return dp[s.length()];
	
		
		
	}

	public static void main(String[] args) {
		String  s ="aaadfab";
		System.out.println(minCut(s));
	}

}
