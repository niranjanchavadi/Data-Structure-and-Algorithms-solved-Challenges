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

	// Function to move last node to the front in a given Linked List
	public static Node rearrange(Node head)
	{
		// Proceed only when list is valid
		if (head == null || head.next == null)
			return null;

		Node ptr = head;

		// Move to second last node
		while (ptr.next.next != null) {
			ptr = ptr.next;
		}

		// Convert the list to circular list
		ptr.next.next = head;

		// Fix head
		head = ptr.next;

		// break the chain
		ptr.next= null;

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