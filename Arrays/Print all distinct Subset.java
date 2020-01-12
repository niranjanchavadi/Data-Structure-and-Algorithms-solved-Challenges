import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main
{
	// Recursive function to print all distinct subsets of S
	// S	--> input set
	// out --> list to store subset
	// i	--> index of next element in set S to be processed
	public static void findPowerSet(int[] S, List<Integer> out, int i)
	{
		// if all elements are processed, print the current subset
		if (i < 0) {
			System.out.println(out);
			return;
		}

		// include current element in the current subset and recur
		out.add(S[i]);
		findPowerSet(S, out, i - 1);

		// exclude current element in the current subset
		out.remove(out.size() - 1); // backtrack

		// remove adjacent duplicate elements
		while (i > 0 && S[i] == S[i - 1]) {
			i--;
		}

		// exclude current element in the current subset and recur
		findPowerSet(S, out, i - 1);
	}

	// Program to generate all distinct subsets of given set
	public static void main(String[] args)
	{
		int[] S = { 1, 3, 1 };

		// sort the set
		Arrays.sort(S);

		// create an empty list to store elements of a subset
		List<Integer> out = new ArrayList<>();
		findPowerSet(S, out, S.length - 1);
	}
}
