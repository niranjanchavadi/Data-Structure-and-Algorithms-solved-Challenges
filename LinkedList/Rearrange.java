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

	// Function to insert given node into the correct sorted position in given
	// list sorted in increasing order using dummy node strategy for head end
	public static Node SortedInsert(Node head, Node newNode)
	{
		Node dummy = new Node();
		Node current = dummy;
		dummy.next = head;

		while (current.next != null && current.next.data < newNode.data) {
			current = current.next;
		}

		newNode.next = current.next;
		current.next = newNode;
		return dummy.next;
	}

	// Given a list, change it to be in sorted order (using SortedInsert()).
	public static Node InsertSort(Node head)
	{
		Node result = null;		// build the answer here
		Node current = head;	// iterate over the original list
		Node next;

		while (current != null)
		{
			// tricky - note the next reference before we change it
			next = current.next;

			result = SortedInsert(result, current);
			current = next;
		}

		return result;
	}

	// main method to sort linked list
	public static void main(String[] args)
	{
		// input keys
		int[] keys = {6, 3, 4, 8, 2, 9};

		// points to the head node of the linked list
		Node head = null;

		// construct linked list
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = InsertSort(head);

		// print linked list
		printList(head);
	}
}