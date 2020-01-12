// Create a Pair class to wrap immutable primitive ints
class Pair
{
	public int max, min;

	public Pair(int max, int min) {
		this.max = max;
		this.min = min;
	}
}

class Main
{
	// Divide & Conquer solution to find minimum and maximum number in an array
	public static void findMinAndMax(int[] A, int left, int right, Pair p)
	{
		// if array contains only one element

		if (left == right)			// common comparison
		{
			if (p.max < A[left]) {	// comparison 1
				p.max = A[left];
			}

			if (p.min > A[right]) {	// comparison 2
				p.min = A[right];
			}

			return;
		}

		// if array contains only two elements

		if (right - left == 1)			// common comparison
		{
			if (A[left] < A[right])		// comparison 1
			{
				if (p.min > A[left]) {	// comparison 2
					p.min = A[left];
				}

				if (p.max < A[right]) {	// comparison 3
					p.max = A[right];
				}
			}
			else {
				if (p.min > A[right]) {	// comparison 2
					p.min = A[right];
				}
				
				if (p.max < A[left]) {	// comparison 3
					p.max = A[left];
				}
			}
			
			return;
		}

		// find mid element
		int mid = (left + right) / 2;

		// recur for left sub-array
		findMinAndMax(A, left, mid, p);

		// recur for right sub-array
		findMinAndMax(A, mid + 1, right, p);
	}

	public static void main(String[] args)
	{
		int[] A = { 7, 2, 9, 3, 1, 6, 7, 8, 4 };

		// initialize the minimum element by infinity and the 
		// maximum element by minus infinity
		Pair p = new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE);
		findMinAndMax(A, 0, A.length - 1, p);

		System.out.println("The minimum element in the array is " + p.min);
		System.out.println("The maximum element in the array is " + p.max);
	}
}