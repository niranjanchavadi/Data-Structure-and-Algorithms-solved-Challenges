// A linked list node
class Node
{
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	Node() { }
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

	// Function that takes a linked list and returns a complete copy of that
	// list using dummy node
	public static Node CopyList(Node head)
	{
		Node current = head; // used to iterate over the original list
		Node tail; // point to the last node in the new list
		Node dummy = new Node(); // build the new list off this dummy node

		tail = dummy; // start the tail pointing at the dummy

		while (current != null)
		{
			tail.next = new Node(current.data, tail.next); // add each node at the tail
			tail = tail.next; // advance the tail to the new last node
			current = current.next;
		}
		return dummy.next;
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