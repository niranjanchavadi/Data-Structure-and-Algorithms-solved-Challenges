class Main
{
	// Function to find ceil of x in sorted array A[left..right]
	// i.e. smallest integer greater than or equal to x
	public static int getCeil(int[] A, int left, int right, int x)
	{
		// search space is A[left..right]

		// if x is less than equal to leftest element in search
		// space, the leftest element is the ceil
		if (x <= A[left]) {
			return A[left];
		}

		// if x is more than rightest element in the search space,
		// its ceil doesn't exists
		if (x > A[right]) {
			return -1;
		}

		// find middle index
		int mid = (left + right) / 2;

		// if x is equal to mid element, it is the ceil
		if (A[mid] == x) {
			return A[mid];
		}

		// if x is more than the mid element, ceil exists in
		// right sub-array A[mid+1..right]
		else if (A[mid] < x) {
			return getCeil(A, mid + 1, right, x);
		}

		// if x is less than the mid element, ceil exists in left
		// sub-array A[left..mid](Note - mid element can also be ceil)
		else {
			return getCeil(A, left, mid, x);
		}
	}

	// Function to find floor of x in sorted array A[left..right]
	// i.e. largest integer less than or equal to x
	public static int getFloor(int[] A, int left, int right, int x)
	{
		// search space is A[left..right]

		// if x is less than the leftest element in search
		// space, its floor doesn't exists
		if (x < A[left]) {
			return -1;
		}

		// if x is more than equal to the rightest element in
		// the search space, it is the floor
		if (x >= A[right]) {
			return A[right];
		}

		// find middle index
		int mid = (left + right) / 2;

		// this check is placed to handle infinite loop for
		// call getFloor(A, mid, right, x);
		if (mid == left) {
			return A[left];
		}

		// if x is equal to mid element, it is the floor
		if (A[mid] == x) {
			return A[mid];
		}

		// if x is more than the mid element, floor exists in right
		// sub-array A[mid..right](Note - mid element can also be floor)
		else if (A[mid] < x) {
			return getFloor(A, mid, right, x);
		}
		
		// if x is less than the mid element, floor exists in
		// left sub-array A[left..mid-1]
		else {
			return getFloor(A, left, mid - 1, x);
		}
	}

	public static void main(String[] args)
	{
		int[] A = { 1, 4, 6, 8, 9 };

		for (int i = 0; i <= 10; i++)
		{
			System.out.print("Number " + i + " -> ");
			System.out.print("ceiling is " + getCeil(A, 0, A.length - 1, i) + ", ");
			System.out.println("floor is " + getFloor(A, 0, A.length - 1, i));
		}
	}
}