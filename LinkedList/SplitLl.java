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

	/*
	Given the source list, split its nodes into two shorter lists.
	If we number the elements 0, 1, 2, ... then all the even elements
	should go in the first list, and all the odd elements in the second.
	The elements in the new lists may be in any order.
	*/
	public static Node[] AlternatingSplit(Node source)
	{
		// Split the nodes to these 'a' and 'b' lists
		Node a = null;
		Node b = null;
		Node current = source;

		while (current != null)
		{
			// Move a node to 'a'

			Node newNode = current;	// the front source node
			current = current.next;	// Advance the source

			newNode.next = a;		// Link the old dest off the new node
			a = newNode;			// Move dest to point to the new node

			if (current != null) {
				// Move a node to 'b'

				newNode = current;	// the front source node
				current = current.next;	// Advance the source

				newNode.next = b;		// Link the old dest off the new node
				b = newNode;			// Move dest to point to the new node
			}
		}

		return new Node[] { a, b };
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7 };

		// construct first linked list
		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		Node[] nodes = AlternatingSplit(head);

		// print both linked list
		printList("First List : ", nodes[0]);
		printList("Second List : ", nodes[1]);
	}
}