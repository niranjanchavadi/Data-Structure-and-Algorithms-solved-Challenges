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

	// Rearrange the linked list so that it has alternating high, low values
	public static Node rearrange(Node head)
	{
		// empty list
		if (head == null)
			return null;

		Node prev = head;
		Node curr = head.next;

		// start from second node
		while (curr != null)
		{
			// If the prev node is greater than current node, swap their values
			if (prev.data > curr.data) {
				int temp = prev.data;
				prev.data = curr.data;
				curr.data = temp;
			}

			// if next node is greater than current node, swap their values
			if (curr.next != null && curr.next.data > curr.data) {
				int temp = curr.next.data;
				curr.next.data = curr.data;
				curr.data = temp;
			}

			// update prev and curr node
			prev = curr.next;

			if (curr.next == null) {
				break;
			}

			curr = curr.next.next;
		}

		return head;
	}

	// Rearrange the linked list so that it has alternating high, low values
	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 6 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = rearrange(head);

		printList(head);
	}
}