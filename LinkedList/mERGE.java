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

	// Takes two lists sorted in increasing order, and merge their nodes
	// together to make one big sorted list which is returned
	public static Node SortedMerge(Node a, Node b)
	{
		// a dummy first node to hang the result on
		Node dummy = new Node();

		// Points to the last result node -- so tail.next is the place
		// to add new nodes to the result.
		Node tail = dummy;

		while (true)
		{
			// if either list runs out, use the other list
			if (a == null)
			{
				tail.next = b;
				break;
			}
			else if (b == null)
			{
				tail.next = a;
				break;
			}

			if (a.data <= b.data) {
				if (a != null) {
					Node newNode = a;	// the front source node
					a = a.next;		 // Advance the source

					newNode.next = tail.next;	// Link the old dest off the new node
					tail.next = newNode;		// Move dest to point to the new node
				}
			}
			else {
				if (b != null) {
					Node newNode = b;	// the front source node
					b = b.next;			// Advance the source

					newNode.next = tail.next;	// Link the old dest off the new node
					tail.next = newNode;		// Move dest to point to the new node
				}
			}
			tail = tail.next;
		}

		return dummy.next;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7 };

		Node a = null, b = null;
		for (int i = keys.length - 1; i >= 0; i = i - 2) {
			a = a = new Node(keys[i], a);
		}

		for (int i = keys.length - 2; i >= 0; i = i - 2) {
			b = b = new Node(keys[i], b);
		}

		// print both linked list
		printList("First List : ", a);
		printList("Second List : ", b);

		Node head = SortedMerge(a, b);
		printList("After Merge : ", head);
	}
}