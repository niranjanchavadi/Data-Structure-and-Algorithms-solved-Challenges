// A linked list node
class Node
{
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
};

class Main
{
	// Recursive function to return K'th node from the end in a linked list
	public static int getKthFromtheEnd(Node node, int k)
	{
		// base case
		if (node == null) {
			return 0;
		}

		int count = getKthFromtheEnd(node.next, k) + 1;

		if (count == k) {
			System.out.println("K'th node from the end is " + node.data);
		}

		return count;
	}


	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		int k = 3;
		getKthFromtheEnd(head, k);
	}
}