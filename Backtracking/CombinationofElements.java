import java.util.Arrays;

class CombinationofElements
{
	// Find all combinations that satisfies given constraints
	public static void findAllCombinations(int[] arr, int elem, int n)
	{
		// if all elements are filled, print the solution
		if (elem > n)
		{
			for (int i : arr)
				System.out.print(i + " ");
			System.out.println();

			return;
		}

		// try all possible combinations for element elem
		for (int i = 0; i < 2*n; i++)
		{
			// if position i and (i+elem+1) are not occupied in the vector
			if (arr[i] == -1 && (i + elem + 1) < 2*n &&
					arr[i + elem + 1] == -1)
			{
				// place elem at position i and (i+elem+1)
				arr[i] = elem;
				arr[i + elem + 1] = elem;

				// recur for next element
				findAllCombinations(arr, elem + 1, n);

				// backtrack (remove elem from position i and (i+elem+1) )
				arr[i] = -1;
				arr[i + elem + 1] = -1;
			}
		}
	}

	public static void main(String[] args)
	{
		// given number
		int n = 3;

		// create a vector of double the size of given number with
		// all its elements initialized by -1
		int[] arr = new int[2*n];
		Arrays.fill(arr, -1);

		// start from element 1
		int elem = 1;
		findAllCombinations(arr, elem, n);
	}
}