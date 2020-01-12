import java.util.ArrayList;
import java.util.List;

class Main
{
	// Function to print all sub-sequences of the specified String
	public static void findPowerSet(String str)
	{
		int n = str.length();

		// N stores total number of subsets
		int N = (int)Math.pow(2, n);
		List<String> result = new ArrayList<>();

		// generate each subset one by one
		for (int i = 0; i < N; i++)
		{
			StringBuilder sb = new StringBuilder();

			// check every bit of i
			for (int j = 0; j < n; j++)
			{
				// if j'th bit of i is set, print S[j]
				if ((i & (1 << j)) != 0) {
					sb.append(str.charAt(j));
				}
			}
			result.add("'" + sb.toString() + "'");
		}

		System.out.println(result);
	}

	// Program to print all sub-sequences of the specified String
	public static void main(String[] args)
	{
		String str = "apple";
		findPowerSet(str);
	}
}