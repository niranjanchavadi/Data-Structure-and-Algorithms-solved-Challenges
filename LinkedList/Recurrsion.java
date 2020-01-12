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

	// Recursive function to rearrange the list
	public static Node rearrange(Node head, Node odd, Node even,
								 Node oddRef)
	{
		// we have reached the end of the list
		if (head == null)
		{
			// null terminate the list
			odd.next = null;

			// join even sublist and odd sublist
			even.next = oddRef.next;
			return head;
		}

		// if current node is odd
		if ((head.data & 1) != 0)
		{
			odd.next = head;
			rearrange(head.next, head, even, oddRef);
		}

		// if current node is even
		else
		{
			even.next = head;
			rearrange(head.next, odd, head, oddRef);
		}

		return head;
	}

	// Rearrange the given linked list by separating odd nodes from even ones and
	// maintaining their relative order.
	public static Node rearrangeEvenOdd(Node head)
	{
		Node odd = new Node();
		Node even = new Node();

		rearrange(head, odd, even, odd);

		return even.next;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = rearrangeEvenOdd(head);
		printList(head);
	}
}