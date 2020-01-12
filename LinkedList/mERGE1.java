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
	// Helper function to print given linked list
	public static void printList(String msg, Node head)
	{
		System.out.print(msg);

		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " -> ");
			ptr = ptr.next;
		}

		System.out.println("null");
	}

	// Takes two lists sorted in increasing order, and merge their nodes
	// together to make one big sorted list which is returned
	public static Node SortedMerge(Node a, Node b)
	{
		// Base cases
		if (a == null) {
			return b;
		}
		else if (b == null) {
			return a;
		}

		Node result;

		// Pick either a or b, and recur
		if (a.data <= b.data)
		{
			result = a;
			result.next = SortedMerge(a.next, b);
		}
		else
		{
			result = b;
			result.next = SortedMerge(a, b.next);
		}

		return result;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7 };

		Node a = null, b = null;
		for (int i = keys.length - 1; i >= 0; i = i - 2) {
			a = new Node(keys[i], a);
		}

		for (int i = keys.length - 2; i >= 0; i = i - 2) {
			b = new Node(keys[i], b);
		}

		// print both linked list
		printList("First List : ", a);
		printList("Second List : ", b);

		Node head = SortedMerge(a, b);
		printList("After Merge : ", head);
	}
}