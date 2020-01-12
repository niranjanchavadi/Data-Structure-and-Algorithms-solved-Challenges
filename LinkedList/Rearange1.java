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

	// Rearrange the given linked list by separating odd nodes from even ones and
	// maintaining their relative order. This approach uses dummy node
	public static Node rearrangeEvenOdd(Node head)
	{
		Node odd = new Node(), even = new Node();
		Node oddTail = odd, evenTail = even;

		Node curr = head;

		while (curr != null)
		{
			if ((curr.data & 1) != 0)
			{
				oddTail.next = curr;
				oddTail = oddTail.next;
			}
			else
			{
				evenTail.next = curr;
				evenTail = curr;
			}
			curr = curr.next;
		}

		evenTail.next = odd.next;
		oddTail.next = null;
		return even.next;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = rearrangeEvenOdd(head);
		printList(head);
	}
}