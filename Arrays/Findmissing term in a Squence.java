class Main
{
	// Function to find missing term in a sequence
	public static int missingTerm(int[] A)
	{
		// search space is A[left..right]
		int left = 0, right = A.length - 1;

		// calculate common difference between successive elements
		int diff = (A[A.length - 1] - A[0]) / A.length;

		// run till search space is exhausted
		while (left <= right)
		{
			// find middle index
			int mid = right - (right - left) / 2;

			// check difference of mid element with its right neighbor
			if (mid + 1 < A.length && A[mid + 1] - A[mid] != diff) {
				return A[mid + 1] - diff;
			}

			// check difference of mid element with its left neighbor
			if (mid - 1 >= 0 && A[mid] - A[mid - 1] != diff) {
				return A[mid - 1] + diff;
			}

			// if missing element lies on left sub-array, then we reduce
			// our search space to right sub-array A[left..mid-1]
			if (A[mid] - A[0] != (mid - 0) * diff) {
				right = mid - 1;
			}

			// if missing element lies on right sub-array, then reduce
			// our search space to right sub-array A[mid+1..right]
			else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int[] A = { 5, 7, 9, 11, 15 };

		System.out.println("Missing element is " + missingTerm(A));
	}
}