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
	public static void printList(Node head)
	{
		Node ptr = head;
		while (ptr != null)
		{
			System.out.print(ptr.data + " -> ");
			ptr = ptr.next;
		}

		System.out.println("null");
	}

	// Reverses the given linked list by changing its next fields and
	// its head.
	public static Node reverse(Node head)
	{
		Node prev = null;
		Node current = head;

		// traverse the list
		while (current != null)
		{
			// tricky: note the next node
			Node next = current.next;

			current.next = prev;	// fix the current node

			prev = current;
			current = next;
		}

		// fix the head to point to the new front
		return prev;
	}

	// reverse linked list iteratively
	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = reverse(head);
		printList(head);
	}
}