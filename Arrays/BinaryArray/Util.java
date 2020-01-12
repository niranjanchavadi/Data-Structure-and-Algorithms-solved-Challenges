package BinaryArray;

import java.util.HashMap;
import java.util.Map;

class Util
{
	// Utility function to print the sub-array formed by A[i, j]
	public static void printSubArray(int[] A, int i, int j, int n)
	{
		if (i < 0 || i > j || j >= n) { // invalid input
			return;
		}

		for (int index = i; index < j; index++) {
			System.out.print(A[index] + ", ");
		}

		System.out.println(A[j]);
	}

	// Function to print all sub-arrays having distinct elements
	public static void calculate(int[] A)
	{
		int n = A.length;

		// Map to mark elements as visited in the current window
		Map<Integer, Boolean> visited = new HashMap<>();

		// put all elements in a map
		for (int val: A) {
			visited.put(val, false);
		}

		// points to left and right boundary of the current window
		// i.e. current window is formed by A[left, right]
		int right = 0, left = 0;

		// loop until right index of the current window is less
		// than the maximum index
		while (right < n)
		{
			// keep increasing the window size if all elements in the
			// current window are distinct
			while (right < n && !visited.get(A[right]))
			{
				visited.put(A[right], true);
				right++;
			}

			printSubArray(A, left, right - 1, n);

			// As soon as duplicate is found (A[right]), 
			// terminate the above loop and reduce the window's size 
			// from its left to remove the duplicate

			while (right < n && visited.get(A[right]))
			{
				visited.put(A[left], false);
				left++;
			}
		}
	}

	// main function
	public static void main(String[] args)
	{
		int[] A = { 5, 2, 3, 5, 4, 3 };

		calculate(A);
	}
}