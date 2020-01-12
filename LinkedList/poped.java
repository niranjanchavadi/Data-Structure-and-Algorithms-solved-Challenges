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

	// The opposite of Push(). Takes a non-empty list and removes the front
	// node, and prints the data which was in that node.
	public static Node pop(Node headRef)
	{
		// underflow condition
		if (headRef == null) {
			return null;
		}

		int result = headRef.data;	// pull out data before node is deleted
		headRef = headRef.next;		// unlink the head node for the caller

		System.out.println("Popped node " + result);

		return headRef;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = {1, 2, 3, 4};

		// points to the head node of the linked list
		Node head = null;

		// construct linked list
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = pop(head);

		// print remaining linked list
		printList(head);
	}
}