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
	// Iterative function to return K'th node from the end in a linked list
	public static Node getKthFromtheEnd(Node head, int k)
	{
		Node curr = head;

		// move k nodes ahead in the linked list
		for (int i = 0; curr != null && i < k; i++) {
			curr = curr.next;
		}

		// return if k is more than number of nodes in the list
		if (curr == null) {
			return null;
		}

		// move head and curr parallelly till curr reaches end of the list
		while (curr != null)
		{
			head = head.next;
			curr = curr.next;
		}

		// head now will contains Kth node from the end
		return head;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		int k = 3;
		Node node = getKthFromtheEnd(head, k);

		if (node != null) {
			System.out.println("K'th node from the end is " + node.data);
		}
	}
}