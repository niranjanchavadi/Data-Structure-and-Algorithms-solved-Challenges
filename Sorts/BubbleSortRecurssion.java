import java.util.Arrays;

class Main
{
	// Utility function to swap values at two indices in the array
	public static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Recursive function to perform bubble sort on sub-array arr[i..n]
	public static void bubbleSort(int arr[], int n)
	{
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}
		if (n - 1 > 1) {
			bubbleSort(arr, n - 1);
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 3, 5, 8, 4, 1, 9, -2 };

		bubbleSort(arr, arr.length);

		// print the sorted array
		System.out.println(Arrays.toString(arr));
	}
}