// Data Structure to store a linked list node
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
};

class Main
{
	// Helper function to insert new Node in the beginning of the linked list
	public static Node push(Node head, int data)
	{
		Node node = new Node(data);
		node.next = head;
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


	// Recursive function to reverse linked list.
	// It reverses given linked list by fixing the head pointer first and
	// then .next pointers of very node in reverse order
	public static Node reverse(Node head)
	{
		Node first, rest;

		// empty list base case
		if (head == null) {
			return head;
		}

		first = head;		// suppose first = {1, 2, 3}
		rest = first.next;	// rest = {2, 3}

		// empty rest base case
		if (rest == null) {
			return head;
		}

		rest = reverse(rest);	// Recursively reverse the smaller {2, 3} case
		// after: rest = {3, 2}

		first.next.next = first;	// put first elem on the end of the list
		first.next = null;			// (tricky step -- make a drawing)
		head = rest;				// fix the head pointer

		return head;
	}

	// Reverse linked list using Recursion
	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6 };

		Node head = null;
		for (int i = keys.length - 1; i >=0; i--) {
			head = push(head, keys[i]);
		}

		head = reverse(head);
		printList(head);
	}
}