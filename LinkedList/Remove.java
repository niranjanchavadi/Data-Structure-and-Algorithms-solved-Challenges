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

	// Remove duplicates from a sorted list
	public static Node removeDuplicates(Node head)
	{
		// do nothing if the list is empty
		if (head == null) {
			return null;
		}

		Node current = head;

		// Compare current node with next node
		while(current.next != null)
		{
			if (current.data == current.next.data)
			{
				Node nextNext = current.next.next;
				current.next = nextNext;
			}
			else {
				current = current.next; // only advance if no deletion
			}
		}

		return head;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = {1, 2, 2, 2, 3, 4, 4, 5};

		// points to the head node of the linked list
		Node head = null;

		// construct linked list
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = removeDuplicates(head);

		// print linked list
		printList(head);
	}
}