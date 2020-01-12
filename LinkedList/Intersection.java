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

	// Compute a new sorted list that represents the intersection
	// of the two given sorted lists without using dummy node
	public static Node SortedIntersect(Node a, Node b)
	{
		Node head = null, tail = null;

		// Once one or the other list runs out -- we're done
		while (a != null && b != null)
		{
			if (a.data == b.data)
			{
				if (head == null) {
					tail = head = new Node(a.data, head);
				}
				else {
					tail = tail.next = new Node(a.data, tail.next);
				}

				a = a.next;
				b = b.next;
			}

			// advance the smaller list
			else if (a.data < b.data)
				a = a.next;
			else
				b = b.next;
		}
		return head;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Node a = null;
		for (int i = keys.length - 1; i >= 0; i = i - 3) {
			a = new Node(keys[i], a);
		}

		Node b = null;
		for (int i = keys.length - 1; i >= 0; i = i - 2) {
			b = new Node(keys[i], b);
		}

		// print both linked list
		printList("First List : ", a);
		printList("Second List : ", b);

		Node head = SortedIntersect(a, b);
		printList("After Intersection : ", head);
	}
}