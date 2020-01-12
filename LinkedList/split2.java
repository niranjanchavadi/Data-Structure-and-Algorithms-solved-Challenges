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

	// Recursive function to split given linked list into two lists where
	// each list containing alternating elements from the original list.
	// The solution maintains the same order as the source list
	public static void AlternatingSplit(Node odd, Node even)
	{
		if (odd == null || even == null) {
			return;
		}

		if (odd.next != null) {
			odd.next = odd.next.next;
		}

		if (even.next != null) {
			even.next = even.next.next;
		}

		AlternatingSplit(odd.next, even.next);
	}

	/*
	Given the source list, split its nodes into two shorter lists.
	If we number the elements 0, 1, 2, ... then all the even elements
	should go in the first list, and all the odd elements in the second.
	The elements in the new lists may be in any order.
	*/
	public static Node[] AlternatingSplit(Node source)
	{
		Node aRef = source;
		Node bRef = source.next;
		AlternatingSplit(aRef, bRef);

		return new Node[] { aRef, bRef };
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7 };

		// construct first linked list
		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		Node[] nodes = AlternatingSplit(head);

		// print both linked list
		printList("First List : ", nodes[0]);
		printList("Second List : ", nodes[1]);
	}
}