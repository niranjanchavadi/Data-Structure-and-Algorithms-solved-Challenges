// A linked list node
class Node
{
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	Node() {}
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
		Node aDummy = new Node();
		Node aTail = aDummy; // points to the last node in 'a'
		aDummy.next = null;

		Node bDummy = new Node();
		Node bTail = bDummy; // points to the last node in 'b'
		bDummy.next = null;

		Node current = source;

		while (current != null)
		{
			// add at 'a' tail

			Node newNode = current;
			current = current.next;

			newNode.next = aTail.next;
			aTail.next = newNode;

			aTail = aTail.next;				 // advance the 'a' tail
			if (current != null)
			{
				// add at 'b' tail

				newNode = current;
				current = current.next;

				newNode.next = bTail.next;
				bTail.next = newNode;

				bTail = bTail.next;	 // advance the 'b' tail
			}
		}

		return new Node[] { aDummy.next, bDummy.next };
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