class Main
{
	public static void convert(int[] arr)
	{
		arr[0] = arr[1] = arr[0] & arr[1];
		// arr[0] = arr[1] -= arr[1];
		// arr[1] = arr[0] -= arr[0];
	}

	public static void main(String[] args)
	{
		int[] arr1 = { 0, 1 };
		convert(arr1);
		System.out.println(arr1[0] + " " + arr1[1]);

		int[] arr2 = { 1, 0 };
		convert(arr2);
		System.out.println(arr2[0] + " " + arr2[1]);

		int[] arr3 = { 0, 0 };
		convert(arr3);
		System.out.println(arr3[0] + " " + arr3[1]);
	}
}