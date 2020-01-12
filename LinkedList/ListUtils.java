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

class FirstLL
{
	// Helper function to return new linked list node from heap
	public static Node newNode(int key)
	{
		Node node = new Node(key, null);
		return node;
	}

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

	// Function to add a new node at the tail end of the list
	// instead of its head
	public static Node appendNode(Node head, int key)
	{
		Node current = head;
		Node node = newNode(key);

		// special case for length 0
		if (current == null) {
			head = node;
		}
		else {
			// Locate the last node
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}

		return head;
	}

	// main method to implement linked list
	public static void main(String[] args)
	{
		// input keys
		int[] keys = {1, 2, 3, 4};

		// points to the head node of the linked list
		Node head = null;
		for (int key: keys) {
			head = appendNode(head, key);
		}

		// print linked list
		printList(head);
	}
}