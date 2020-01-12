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

	// Function that takes a linked list and returns a complete copy of that
	// list using dummy node using push() function
	public static Node CopyList(Node head)
	{
		Node current = head;	 // used to iterate over original list
		Node newList = null; // head of the new list
		Node tail = null;	 // point to last node in new list

		while (current != null)
		{
			// special case for the first new node
			if (newList == null)
			{
				newList = new Node(current.data, newList);
				tail = newList;
			}
			else
			{
				tail.next = new Node(current.data, tail.next); // add each node at tail
				tail = tail.next;		 // advance the tail to new last node
			}
			current = current.next;
		}

		return newList;
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