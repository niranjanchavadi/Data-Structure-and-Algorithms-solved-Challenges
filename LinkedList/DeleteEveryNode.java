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

	// Recursive function to delete every n nodes in a linked list after
	// skipping m nodes
	public static Node deleteNodes(Node head, int m, int n)
	{
		// base case
		if (head == null || head.next == null) {
			return head;
		}

		Node prev = null, next;
		Node curr = head;

		// skip m nodes
		for (int i = 1; curr != null && i <= m; i++)
		{
			prev = curr;
			curr = curr.next;
		}

		// delete next n nodes
		for (int i = 1; curr != null && i <= n; i++)
		{
			next = curr.next;
			curr = next;
		}

		// link remaining nodes with last node
		prev.next = curr;

		// recur for remaining nodes
		deleteNodes(curr, m, n);

		return prev;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = deleteNodes(head, 1, 3);

		printList(head);
	}
}