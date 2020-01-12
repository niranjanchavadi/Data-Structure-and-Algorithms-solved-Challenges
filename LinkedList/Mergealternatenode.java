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

	// Function to construct a linked list by merging alternate nodes of
	// two given linked lists using dummy node
	public static Node[] merge(Node a, Node b)
	{
		Node dummy = new Node();
		Node tail = dummy;

		while (true)
		{
			// empty list cases
			if (a == null) {
				tail.next = null;	// Note
				break;
			}
			else if (b == null) {
				tail.next = a;
				break;
			}
			// common case: move two nodes to tail
			else {
				tail.next = a;
				tail = a;
				a = a.next;

				tail.next = b;
				tail = b;
				b = b.next;
			}
		}

		a = dummy.next;
		return new Node[] { a, b };
	}

	public static void main(String[] args) {
		Node a = null, b = null;

		// construct first list
		for (int i = 3; i >= 0; i--) {
			a = new Node(i, a);
		}

		// construct second list
		for (int i = 10; i >= 4; i--) {
			b = new Node(i, b);
		}

		// print both linked list
		printList("First List - ", a);
		printList("Second List - ", b);

		Node[] arr = merge(a, b);
		a = arr[0];
		b = arr[1];

		System.out.println("\nAfter Merge - \n");

		printList("First List - ", a);
		printList("Second List - ", b);
	}
}