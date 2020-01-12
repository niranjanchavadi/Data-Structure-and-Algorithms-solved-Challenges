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

	// Recursive function to move last node to the front in a given Linked List
	public static Node rearrange(Node head, Node prev, Node curr)
	{
		// if current node is last node
		if (curr.next == null)
		{
			// make it's next point to fist node
			curr.next = head;

			// set is previous node to point to null
			prev.next = null;

			// return current reference (new head)
			return curr;
		}

		return rearrange(head, curr, curr.next);
	}

	// Function to move last node to the front in a given Linked List
	public static Node rearrange(Node head)
	{
		// if list contains at least two nodes
		if (head != null && head.next != null) {
			head = rearrange(head, null, head);
		}

		return head;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = rearrange(head);

		printList(head);
	}
}