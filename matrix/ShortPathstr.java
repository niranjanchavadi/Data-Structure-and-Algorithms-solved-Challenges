class ShortPathstr
{
	// Find shortest route in a device to construct the given string
	private static void printPath(String str)
	{
		// start at the top-left corner with coordinates (0, 0)
		int x = 0, y = 0;

		int n = str.length();
		for (int i = 0; i < n; i++)
		{
			// find coordinates of the next character
			int X = (str.charAt(i) - 'A') / 5;
			int Y = (str.charAt(i) - 'A') % 5;

			// if the next character is above the current character
			while (x > X) {
				System.out.print("T");
				x--;			// Go up
			}

			// if the next character is below the current character
			while (x < X) {
				System.out.print("B");
				x++;			// Go down
			}

			// if the next character is to the left of current character
			while (y > Y) {
				System.out.print("L");
				y--;			// Go left
			}

			// if the next character is to the right of current character
			while (y < Y) {
				System.out.print("R");
				y++;			// Go right
			}

			// next character is found
			System.out.print("M");
		}
	}

	public static void main(String[] args)
	{
		String str = "TECHIE";
		printPath(str);
	}
}