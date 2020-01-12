// A linked list node
class Node
{
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	Node(int data) {
		this(data, null);
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

	// Recursive function that takes a linked list and returns a complete
	// copy of that list
	public static Node CopyList(Node head)
	{
		if (head == null) {
			return null;
		}

		// Allocate the new node & set its data
		Node newNode = new Node(head.data);

		// recursively set the next field of the new node by recur
		// for the rest nodes
		newNode.next = CopyList(head.next);

		return newNode;
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

		// copy linked list
		Node dup = CopyList(head);

		// print duplicate linked list
		printList(dup);
	}
}