import java.util.Arrays;
import java.util.List;

class Main
{
	// Function to print all sub-arrays of the specified array
	public static void printallSubarrays(List<Integer> arr)
	{
		// consider all sub-arrays starting from i
		for (int i = 0; i < arr.size(); i++)
		{
			// consider all sub-arrays ending at j
			for (int j = i; j < arr.size(); j++)
			{
				// Function to print a sub-array formed by [i, j]
				System.out.println(arr.subList(i, j + 1));
			}
		}
	}

	// Program to print all sub-arrays of the specified array
	public static void main(String[] args)
	{
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
		printallSubarrays(arr);
	}
}