// A linked list node
class Node
{
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	Node() { }
	
	// Helper function to print linked list starting from current node
	public void print()
	{
		Node ptr = this;
		while (ptr.next != null) {
			System.out.print(ptr.data + " -> ");
			ptr = ptr.next;
		}
		System.out.println(ptr.data);
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

	// Function to sort linked list containing 0’s, 1’s and 2’s in single traversal
	public static Node sortList(Node head)
	{
		// base case
		if (head == null || head.next == null) {
			return head;
		}

		// maintain three dummy_ nodes
		Node dummy_0 = new Node(), dummy_1 = new Node(), dummy_2 = new Node();

		// maintain three references
		Node zero = dummy_0, one = dummy_1, two = dummy_2;
		Node curr = head;

		// traverse the list
		while (curr != null)
		{
			if (curr.data == 0)
			{
				zero.next = curr;
				zero = zero.next;
			}
			else if (curr.data == 1)
			{
				one.next = curr;
				one = one.next;
			}
			else
			{
				two.next = curr;
				two = two.next;
			}
			curr = curr.next;
		}

		// combine lists containing 0's, 1's and 2's
		zero.next = (dummy_1.next != null)? (dummy_1.next): (dummy_2.next);
		one.next = dummy_2.next;
		two.next = null;

		// change head
		return dummy_0.next;
	}

	// Sort linked list containing 0’s, 1’s and 2’s in single traversal
	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 0, 0, 1, 2, 1, 2, 1 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = sortList(head);
		head.print();
	}
}